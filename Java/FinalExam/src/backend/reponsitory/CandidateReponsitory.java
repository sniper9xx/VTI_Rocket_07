package backend.reponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.JdbcUtils;

public class CandidateReponsitory implements ICandidateReponsitory{
	private JdbcUtils jdbcUtils;

	public CandidateReponsitory() {
		this.jdbcUtils = new JdbcUtils();
	}

	@Override
	public void dangKyExperienceCandidate(String firstName, String lastName, String pass, String phone, String email,
			int expInYear, String proSkill) throws SQLException {
		// Connect to Database
		Connection connect = jdbcUtils.getConnection();
		// Use PreparedStatement to query with parameters
		String mySqlQuery = "insert into `Candidate` (firstName, lastName, pass, phone, email, expInYear, proSkill) values(?,?,?,?,?,?,?)";
		PreparedStatement ps = connect.prepareStatement(mySqlQuery);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, pass);
		ps.setString(4, phone);
		ps.setString(5, email);
		ps.setInt(6, expInYear);
		ps.setString(7, proSkill);
		int effectRows = ps.executeUpdate();
		if (effectRows == 1)
			System.out.println("Tạo mới tài khoản ExperienceCandidate thành công!");
		jdbcUtils.disconnect();
	}

	@Override
	public void dangKyFresherCandidate(String firstName, String lastName, String pass, String phone, String email,
			String graduationRank) throws SQLException {
		// Connect to Database
		Connection connect = jdbcUtils.getConnection();
		// Use PreparedStatement to query with parameters
		String mySqlQuery = "insert into `Candidate` (firstName, lastName, pass, phone, email, graduationRank) values(?,?,?,?,?,?)";
		PreparedStatement ps = connect.prepareStatement(mySqlQuery);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, pass);
		ps.setString(4, phone);
		ps.setString(5, email);
		ps.setString(6, graduationRank);
		int effectRows = ps.executeUpdate();
		if (effectRows == 1)
			System.out.println("Tạo mới tài khoản FresherCandidate thành công!");
		jdbcUtils.disconnect();
		
	}

	@Override
	public boolean errorLogin(String email, String pass) throws SQLException {
		Connection connect = jdbcUtils.getConnection();
		String mySqlQuery = "select * from `user` where email = ? and pass = ?";
		PreparedStatement ps = connect.prepareStatement(mySqlQuery);
		ps.setString(1, email);
		ps.setString(2, pass);
		boolean check = false;
		ResultSet res = ps.executeQuery();
		if (res.next())
			check = true;
		jdbcUtils.disconnect();
		return check;

	}

}
