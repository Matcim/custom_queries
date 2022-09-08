package co.develhope.Custom_Queries.controller;


import co.develhope.Custom_Queries.entities.Flight;
import co.develhope.Custom_Queries.entities.FlightStatus;
import co.develhope.Custom_Queries.serviceImpl.ServiceFlightImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private ServiceFlightImpl serviceFlight;


    @PostMapping
    public ResponseEntity<Flight> createFlightRandom(@RequestBody Flight flight){
      return serviceFlight.createFlightRandom(flight);
    }

    @GetMapping("/page")
    public Page<Flight> readListFlight(){
        return serviceFlight.listFlight();
    }

   @GetMapping("/status")
    public List<String> flights(){
        return serviceFlight.flight();
   }
}
