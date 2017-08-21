package br.com.fabiosjc.flights.service;

import br.com.fabiosjc.flights.domain.Flight;
import br.com.fabiosjc.flights.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;


/**
 * @author by fabio on 04/04/17.
 */
@Controller
@SpringBootApplication(scanBasePackages = "br.com.fabiosjc.flights")
@EnableJpaRepositories("br.com.fabiosjc.flights.repository")
@EntityScan("br.com.fabiosjc.flights.domain")
@EnableTransactionManagement
public class FlightsApplication {

    @Autowired
    private FlightRepository repository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FlightsApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FlightsApplication.class);
    }

    @PostConstruct
    @Transactional
    public void onLoad(){
        repository.save(new Flight("FLY001"));
        repository.save(new Flight("FLY002"));
        repository.save(new Flight("FLY003"));
    }
}
