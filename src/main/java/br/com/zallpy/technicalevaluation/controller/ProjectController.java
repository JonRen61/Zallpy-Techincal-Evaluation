package br.com.zallpy.technicalevaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zallpy.technicalevaluation.dto.ProjectDTO;
import br.com.zallpy.technicalevaluation.service.ProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GetMapping("/list")
	public List<ProjectDTO> listProjects() {
		return projectService.list();
	}

}
