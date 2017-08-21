package br.com.fabiosjc.flights.repository;

import br.com.fabiosjc.flights.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabio on 20/08/17.
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight findByNumber(final String number);

}
