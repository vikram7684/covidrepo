package io.pragra.learning.pragravisit.repo;

import io.pragra.learning.pragravisit.entity.PragraVisitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepo extends JpaRepository<PragraVisitor, Integer>{

}
