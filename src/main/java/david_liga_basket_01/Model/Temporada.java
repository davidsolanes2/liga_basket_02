package david_liga_basket_01.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by david on 26/01/16.
 */
@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @NotNull
    @Column(name = "start_date")
    protected Date fechaInicio;
    @Column(name = "end_date")
    protected Date fechaFin;

    private String nombre;

    @JsonIgnore
    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

    public Temporada(){}

    public Temporada(Date fechaInicio, Date fechaFin){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/* @Override
    public boolean equals(Object o) {
        if (this== o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Temporada temporada = (Temporada) o;

        return !(id != null ? !id.equals(temporada.id) : temporada.id != null);
    }

    @Override
    public int hashCode() { return id != null ? id.hashCode() : 0; } */

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

}
