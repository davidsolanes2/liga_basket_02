package david_liga_basket_01.Model;

import javax.persistence.*;

/**
 * Created by david on 26/01/16.
 */
@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String nombreLiga;

    public Liga(){}

    public Liga(String nombreLiga){
        this.nombreLiga = nombreLiga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombreLiga='" + nombreLiga + '\'' +
                '}';
    }
}
