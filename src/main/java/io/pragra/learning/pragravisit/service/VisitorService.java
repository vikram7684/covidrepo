package io.pragra.learning.pragravisit.service;

import io.pragra.learning.pragravisit.entity.PragraVisitor;
import io.pragra.learning.pragravisit.exceptions.InvalidDataException;
import io.pragra.learning.pragravisit.repo.VisitorRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitorService {
    private VisitorRepo repo;

    public VisitorService(VisitorRepo repo) {
        this.repo = repo;
    }
    /* create a visitor */
    public PragraVisitor createVisitor(PragraVisitor visitor){
        return repo.save(visitor);
    }

    public PragraVisitor updateVisitor( PragraVisitor visitor) {
        return repo.save(visitor);
    }

    public Optional<PragraVisitor> getById(Integer id)  {
        if(id==null ||  id < 0) {
            throw  new InvalidDataException("ID pass is not valid");
        }
        return repo.findById(id);

    }

    public List<PragraVisitor> getAll(){
        return repo.findAll();
    }

    public List<PragraVisitor> createBatch(List<PragraVisitor> visitors) {
        return repo.saveAll(visitors);
    }

    public void deleteById(int id ){
        repo.deleteById(id);
    }
}
