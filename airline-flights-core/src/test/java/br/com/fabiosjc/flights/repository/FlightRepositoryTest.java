package br.com.fabiosjc.flights.repository;

import br.com.fabiosjc.flights.domain.Flight;
import br.com.fabiosjc.flights.service.FlightsApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author fabio on 20/08/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightsApplication.class)
public class FlightRepositoryTest {

  @Autowired
  private FlightRepository repository;

  @Before
  public void setUp() throws Exception {
    this.repository.deleteAll();

    repository.save(new Flight("FLY311"));
    repository.save(new Flight("FLY411"));
  }

  @Test
  public void findAllTest() throws Exception {
    List<Flight> flights = repository.findAll();
    Assert.assertEquals("Total de vôos diferente do esperado", flights.size(), 2);
  }
}