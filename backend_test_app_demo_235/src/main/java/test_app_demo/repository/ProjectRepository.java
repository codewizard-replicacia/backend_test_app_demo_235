package test_app_demo.repository;


import test_app_demo.model.Project;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ProjectRepository extends SimpleJpaRepository<Project, String> {
    private final EntityManager em;
    public ProjectRepository(EntityManager em) {
        super(Project.class, em);
        this.em = em;
    }
    @Override
    public List<Project> findAll() {
        return em.createNativeQuery("Select * from \"test_app_demo\".\"Project\"", Project.class).getResultList();
    }
}