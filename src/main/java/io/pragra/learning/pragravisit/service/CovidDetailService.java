package io.pragra.learning.pragravisit.service;

import io.pragra.learning.pragravisit.entity.CovidDetail;
import io.pragra.learning.pragravisit.repo.CovidDetailRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CovidDetailService {
    private final CovidDetailRepo repo;
    private final VisitorService service;

    public List<CovidDetail> getAllDetails(Integer visitorId){
        //return repo.findAllByVisitorId(visitorId);
        return repo.getByNativeQuery(visitorId);
    }
    public CovidDetail createCovidDetails(CovidDetail detail, int visitorId) {

              return repo.save(detail);



    }


}
