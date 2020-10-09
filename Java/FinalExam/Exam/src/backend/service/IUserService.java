package backend.service;

import java.sql.SQLException;

public interface IUserService {
	public void registerManager(String fullName, String email, String pass, int expInYear) throws SQLException ;
	
	public void registerEmployee(String fullName, String email, String pass, int projectId, String projectSkill) throws SQLException ;
	
	public void registerProject(int projectId, int teamSize, int idManager, int idEmployees) throws SQLException;
	
	public boolean isUserExists(String email, String pass) throws SQLException ;
}
