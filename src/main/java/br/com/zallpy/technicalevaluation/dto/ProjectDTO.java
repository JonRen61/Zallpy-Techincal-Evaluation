package br.com.zallpy.technicalevaluation.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.zallpy.technicalevaluation.model.Project;

public class ProjectDTO {

    private Project project;

    public ProjectDTO() {
        this.project = new Project();
    }

    public ProjectDTO(Project project) {
        this.project = project;
    }

    public int getId() {
        return project.getId();
    }

    public String getName() {
        return project.getName();
    }

    public Date getRegisterDate() {
        return project.getRegisterDate();
    }

    public int getAppointedHours() {
        return project.getAppointedHours();
    }

    @JsonIgnore
    public Project getProject() {
        return project;
    }

}
