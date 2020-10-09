package entity;

public class Project {
	private int projectId, teamSize, idManager, idEmployees;

	public Project(int projectId, int teamSize, int idManager, int idEmployees) {
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
	}
	
}
