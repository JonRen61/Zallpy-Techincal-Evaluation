package br.com.zallpy.technicalevaluation.dto;

import br.com.zallpy.technicalevaluation.pojo.Project;

public class ProjectDTO {

	private Project project;

	public ProjectDTO(Project project) {
		this.project = project;
	}

	public int getId() {
		return project.getId();
	}

	public String getName() {
		return project.getName();
	}

	public int getAppointedHours() {
		return project.getAppointed_hours();
	}

}
