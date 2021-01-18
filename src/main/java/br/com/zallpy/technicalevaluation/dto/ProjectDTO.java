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

    public void setId(int id) {
        project.setId(id);
    }

    public String getName() {
        return project.getName();
    }

    public void setName(String name) {
        project.setName(name);
    }

    public Date getRegisterDate() {
        return project.getRegisterDate();
    }

    public void setRegisterDate(Date registerDate) {
        project.setRegisterDate(registerDate);
    }

    public int getAppointedHours() {
        return project.getAppointedHours();
    }

    public void setAppointedHours(int appointedHours) {
        project.setAppointedHours(appointedHours);
    }

    @JsonIgnore
    public Project getProject() {
        return project;
    }

}
