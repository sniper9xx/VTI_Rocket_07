package backend.controller;

import java.sql.SQLException;

import backend.service.IUserService;
import backend.service.UserService;

public class UserController {
	private IUserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public void registerManager(String fullName, String email, String pass, int expInYear) throws SQLException {
		userService.registerManager(fullName, email, pass, expInYear);
	}
	
	public void registerEmployee(String fullName, String email, String pass, int projectId, String projectSkill) throws SQLException {
		userService.registerEmployee(fullName, email, pass, projectId, projectSkill);
	}
	
	public void registerProject(int projectId, int teamSize, int idManager, int idEmployees) throws SQLException{
		userService.registerProject(projectId,teamSize,idManager,idEmployees);
	}
	public boolean isUserExists(String email, String pass) throws SQLException {
		return userService.isUserExists(email, pass);
	}
}
