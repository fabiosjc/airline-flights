package br.com.fabiosjc.aflight.repository;

import br.com.fabiosjc.aflight.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabio on 20/08/17.
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {


}
