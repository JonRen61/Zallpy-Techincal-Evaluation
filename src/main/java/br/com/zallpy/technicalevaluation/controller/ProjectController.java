package br.com.zallpy.technicalevaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.zallpy.technicalevaluation.dto.ProjectDTO;
import br.com.zallpy.technicalevaluation.service.ProjectService;

@CrossOrigin(methods = RequestMethod.OPTIONS)
@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/list/{userId}")
    public List<ProjectDTO> list(@PathVariable int userId) {
        return projectService.listByUserId(userId);
    }

    @GetMapping("/find/{projectId}")
    public ProjectDTO getProject(@PathVariable int projectId) {
        return projectService.findById(projectId);
    }

    @PostMapping("/update")
    public ResponseEntity<String> update(@RequestBody ProjectDTO projectDTO) {
        projectService.update(projectDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
