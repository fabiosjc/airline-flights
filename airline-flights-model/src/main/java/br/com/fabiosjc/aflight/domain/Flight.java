package br.com.fabiosjc.aflight.domain;

import br.com.fabiosjc.aflight.domain.enums.FlightStatus;

import javax.persistence.*;
import java.util.Date;

/**
 * Representa as informações sobre um determinado vôo
 *
 * @author fabio on 20/08/17.
 */
@Entity
public class Flight {

    private Long id;
    private String flightNumber;
    private FlightStatus flightStatus;
    private Date departure;
    private Date arrival;
    private City origin;
    private City destination;
    private Number duration;
    private Airplane airplane;
    private Pilot pilot;

    public Flight() {
        // default constructor
    }

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FLIGHT_NUMBER", nullable = false)
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    @OneToOne
    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    @OneToOne
    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    @OneToOne
    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    @OneToOne
    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Number getDuration() {
        return duration;
    }

    public void setDuration(Number duration) {
        this.duration = duration;
    }
}
