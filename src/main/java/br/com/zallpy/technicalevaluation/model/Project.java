package br.com.zallpy.technicalevaluation.model;

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
	private int appointed_hours;

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

	public int getAppointed_hours() {
		return appointed_hours;
	}

	public void setAppointed_hours(int appointed_hours) {
		this.appointed_hours = appointed_hours;
	}

}
