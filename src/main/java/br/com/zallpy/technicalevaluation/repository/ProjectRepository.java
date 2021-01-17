package br.com.zallpy.technicalevaluation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zallpy.technicalevaluation.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    Optional<List<Project>> findByUserId(int userId);

}
