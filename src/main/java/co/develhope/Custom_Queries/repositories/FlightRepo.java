package co.develhope.Custom_Queries.repositories;


import co.develhope.Custom_Queries.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlightRepo extends JpaRepository<Flight,Long> {

    @Query(value = "SELECT  * from custom_queries.flight  WHERE flight_status IN (\"CANCELLED\",\"DELAYERD\");",nativeQuery = true)
    List<String> getFlight();



}
