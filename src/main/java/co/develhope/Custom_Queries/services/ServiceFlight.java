package co.develhope.Custom_Queries.services;

import co.develhope.Custom_Queries.entities.Flight;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface ServiceFlight {



    ResponseEntity<Flight> createFlightRandom(Flight flight);

    Page<Flight> listFlight();


    List<String> flight();



}
