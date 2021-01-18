package br.com.zallpy.technicalevaluation.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Project {

    @Id
    private int id;
    private String name;
    private Date registerDate;
    private int appointedHours;

    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private List<User> user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int getAppointedHours() {
        return appointedHours;
    }

    public void setAppointedHours(int appointedHours) {
        this.appointedHours = appointedHours;
    }

}
