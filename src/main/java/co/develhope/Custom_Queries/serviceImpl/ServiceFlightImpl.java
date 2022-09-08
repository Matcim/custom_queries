package co.develhope.Custom_Queries.serviceImpl;
import co.develhope.Custom_Queries.entities.Flight;
import co.develhope.Custom_Queries.entities.FlightStatus;
import co.develhope.Custom_Queries.entities.PagingFlight;
import co.develhope.Custom_Queries.pageandsort.PageAndSort;
import co.develhope.Custom_Queries.repositories.FlightRepo;
import co.develhope.Custom_Queries.services.ServiceFlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class ServiceFlightImpl implements ServiceFlight {


    @Autowired
    private FlightRepo flightRepo;



    @Autowired
    private PageAndSort pageAndSort;


    @Override
    public ResponseEntity<Flight> createFlightRandom(Flight flight) {
        try {
            int count = 0;
            int numveroVoli = 50;
            Random random = new Random();
            flight.setId(random.nextLong());
            flight.setToAirport(random.ints().toString());
            flight.setFromAirport(random.ints().toString());
            flight.setDescription(random.ints().toString());
            flight.setFlightStatus(FlightStatus.getRandom());
            while (count < numveroVoli) {
                count++;
                return ResponseEntity.ok(flightRepo.save(flight));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity("not found :", HttpStatus.NOT_FOUND);
    }

    @Override
    public Page<Flight> listFlight() {
        PagingFlight pagingFlight = new PagingFlight();
        Sort sort = Sort.by(pagingFlight.getDirection(), pagingFlight.getSortBy());
        PageRequest pageable = PageRequest.of(pagingFlight.getPageNumer(), pagingFlight.getGetPageNumer(), sort);
        return pageAndSort.findAll(pageable);
    }

    @Override
    public List<String> flight() {
        return flightRepo.getFlight();
    }
}


