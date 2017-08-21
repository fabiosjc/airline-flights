package br.com.fabiosjc.aflight.service;

import br.com.fabiosjc.aflight.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author by fabio on 04/04/17.
 */
@Controller
@SpringBootApplication(scanBasePackages = "br.com.fabiosjc.aflight")
@EnableJpaRepositories("br.com.fabiosjc.aflight.repository")
@EntityScan("br.com.fabiosjc.aflight.domain")
@EnableTransactionManagement
public class SpringBootWebApplication {

    @Autowired
    private FlightRepository repository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }
}
