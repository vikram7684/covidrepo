package io.pragra.learning.pragravisit.repo;

import io.pragra.learning.pragravisit.entity.CovidDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CovidDetailRepo extends JpaRepository<CovidDetail, Integer> {
    @Query("SELECT d from CovidDetail d, visitor v where v.id = :id")
    List<CovidDetail> findAllByVisitorId(@Param("id") int id);

    @Query(value = "SELECT d.* FROM covid_details d  where d.visitor_id  = :id", nativeQuery = true)
    List<CovidDetail> getByNativeQuery(@Param("id") int id);
}
