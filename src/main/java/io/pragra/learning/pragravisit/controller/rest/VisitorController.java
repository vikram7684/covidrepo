package io.pragra.learning.pragravisit.controller.rest;
import io.pragra.learning.pragravisit.entity.PragraVisitor;
import io.pragra.learning.pragravisit.service.VisitorService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitorController {

    private VisitorService service;

    public VisitorController(VisitorService service) {
        this.service = service;
    }

    @GetMapping(value = "/api/visitor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PragraVisitor> getAllVisitor(){
       return service.getAll();
    }


    @GetMapping(value = "/api/visitor/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PragraVisitor getAllVisitor(@PathVariable("id") Integer id){
        return service.getById(id).orElseThrow();
    }

    @PutMapping(value = "/api/visitor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PragraVisitor update(@RequestBody PragraVisitor visitor){
        return service.updateVisitor(visitor);
    }

    @PostMapping(value = "/api/visitor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PragraVisitor create(@RequestBody PragraVisitor visitor){
        return service.createVisitor(visitor);
    }
}
