package br.com.zallpy.technicalevaluation.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	private int id;
	private String name;
	private int appointed_hours;

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
