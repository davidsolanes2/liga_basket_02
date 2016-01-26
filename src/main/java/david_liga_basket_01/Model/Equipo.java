package david_liga_basket_01.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by david on 26/01/16.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String nombreEquipo;
    @Column
    protected String nombreEstadio;
    @Column
    protected String localidad;

    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugadores = new HashSet<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "equipos")
    private Set<Temporada> temporadas = new HashSet<>();

    public Equipo(){}

    public Equipo(String nombreEquipo, String nombreEstadio, String localidad){
        this.nombreEquipo = nombreEquipo;
        this.nombreEstadio = nombreEstadio;
        this.localidad = localidad;
    }

    public Long getid() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getnombreEquipo() { return nombreEquipo; }

    public void setnombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public String getnombreEstadio() { return nombreEstadio; }

    public void setnombreEstadio(String nombreEstadio) { this.nombreEstadio = nombreEstadio; }

    public String getlocalidad() {
        return localidad;
    }

    public void setlocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", nombreEstadio='" + nombreEstadio + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }


}
