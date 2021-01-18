package br.com.zallpy.technicalevaluation.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.zallpy.technicalevaluation.model.Project;

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
        return project.getAppointedHours();
    }

    @JsonIgnore
    public Project getProject() {
        return project;
    }

}
