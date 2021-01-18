package br.com.zallpy.technicalevaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zallpy.technicalevaluation.dto.ProjectDTO;
import br.com.zallpy.technicalevaluation.service.ProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/list/{userId}")
    public List<ProjectDTO> listProjects(@PathVariable int userId) {
        return projectService.listByUserId(userId);
    }

    @PostMapping("/update")
    public void update(@RequestBody ProjectDTO projectDTO) {
        projectService.update(projectDTO);
    }

}
