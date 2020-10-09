package backend.reponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.JdbcUtils;

public class UserReponsitory implements IUserReponsitory {
	private JdbcUtils jdbcUtils;

	public UserReponsitory() {
		jdbcUtils = new JdbcUtils();
	}

	@Override
	public void registerManager(String fullName, String email, String pass, int expInYear) throws SQLException {

		Connection con = jdbcUtils.getConnection();
		String query = "insert into `user` (fullName, email, pass, expInYear) values(?,?,?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, fullName);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, pass);
		preparedStatement.setInt(4, expInYear);
		int effectRows = preparedStatement.executeUpdate();
		if (effectRows == 1)
			System.out.println("Tạo mới tài khoản manager thành công!");
		jdbcUtils.disconnect();
	}

	@Override
	public void registerEmployee(String fullName, String email, String pass, int projectId, String projectSkill)
			throws SQLException {
		Connection con = jdbcUtils.getConnection();
		String query = "insert into `user` (fullName, email, pass, projectId, proSkill) values(?,?,?,?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, fullName);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, pass);
		preparedStatement.setInt(4, projectId);
		preparedStatement.setString(5, projectSkill);
		int effectRows = preparedStatement.executeUpdate();
		if (effectRows == 1)
			System.out.println("Tạo mới tài khoản employee thành công!");
		jdbcUtils.disconnect();
	}

	@Override
	public boolean isUserExists(String email, String pass) throws SQLException {
		Connection con = jdbcUtils.getConnection();
		String query = "select * from `user` where email = ? and pass = ?";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1,email);
		preparedStatement.setString(2,pass);		
		boolean check = false;
		ResultSet res = preparedStatement.executeQuery();		
		if(res.next())
			check = true;
		jdbcUtils.disconnect();
		return check;
	}

	@Override
	public void registerProject(int projectId, int teamSize, int idManager, int idEmployees) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = jdbcUtils.getConnection();
		String query = "insert into `project` (projectId, teamSize, idManager, idEmployees) values(?,?,?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, projectId);
		preparedStatement.setInt(2,teamSize);
		preparedStatement.setInt(3, idManager);
		preparedStatement.setInt(4, idEmployees);
		int effectRows = preparedStatement.executeUpdate();
		if (effectRows == 1)
			System.out.println("Tạo mới project thành công!");
		jdbcUtils.disconnect();
	}

}
