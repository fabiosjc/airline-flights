package br.com.fabiosjc.flights.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Representação simplificada da entidade Aeronave
 *
 * @author fabio on 20/08/17.
 */
@Entity
public class Airplane {

    private Long id;

    public Airplane() {
        // default constructor
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
