package io.pragra.learning.pragravisit.controller.rest;

import io.pragra.learning.pragravisit.entity.CovidDetail;
import io.pragra.learning.pragravisit.service.CovidDetailService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "CovidDetails")
@Data
public class CovidDetailsController {

    private final CovidDetailService service;

    @ApiResponses(
            value = {
                        @ApiResponse(code = 200, message = "Return covid details"),
                        @ApiResponse(code = 400, message = "Not Found", response = PragraError.class)
            }
    )
    @GetMapping("/covid-details/{id}")
    public ResponseEntity<List<CovidDetail>> getAllCovidDetails(@PathVariable("id") int id) {
        return ResponseEntity.status(200).header("X-SENDER", "PRAGRA")
                        .body(service.getAllDetails(id));

    }
}
