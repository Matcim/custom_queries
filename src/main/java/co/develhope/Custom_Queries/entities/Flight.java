package co.develhope.Custom_Queries.entities;




import org.springframework.data.jdbc.repository.query.Query;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private Long id;
    private String description;
    private String fromAirport;
    private String toAirport;
    @Enumerated(EnumType.STRING)
    private FlightStatus flightStatus;


    public Flight(){

    }
    public Flight(Long id,String description,String fromAirport,String toAirport,FlightStatus flightStatus){
        this.id = id;
        this.toAirport=toAirport;
        this.flightStatus=flightStatus;
        this.description=description;
        this.fromAirport=fromAirport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

}
