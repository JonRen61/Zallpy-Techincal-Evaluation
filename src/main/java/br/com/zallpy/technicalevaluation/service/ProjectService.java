package br.com.zallpy.technicalevaluation.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zallpy.technicalevaluation.dto.ProjectDTO;
import br.com.zallpy.technicalevaluation.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectDTO> listByUserId(int userId) {
        return projectRepository.findByUserId(userId).orElse(Collections.emptyList()).stream().map(ProjectDTO::new).collect(Collectors.toList());
    }

    public void update(ProjectDTO projectDTO) {
        projectRepository.save(projectDTO.getProject());
    }

    public ProjectDTO findById(int projectId) {
        return new ProjectDTO(projectRepository.findById(projectId).orElse(null));
    }

}
