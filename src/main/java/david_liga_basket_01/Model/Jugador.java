package david_liga_basket_01.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by david on 26/01/16.
 */
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String nombreJugador;
    @Column
    protected Date fechaNacimiento;
    @Column
    protected int numCanastas;
    @Column
    protected int numAsistencias;
    @Column
    protected int numRebotes;
    @Column
    protected String posicion;

    @JsonIgnore
    @ManyToOne
    private Equipo equipo;

    public Jugador(){}

    public Jugador(String nombreJugador, Date fechaNacimiento, int numCanastas, int numAsistencias, int numRebotes, String posicion){

        this.nombreJugador = nombreJugador;
        this.fechaNacimiento = fechaNacimiento;
        this.numCanastas = numCanastas;
        this.numAsistencias = numAsistencias;
        this.numRebotes = numRebotes;
        this.posicion = posicion;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(int numCanastas) {
        this.numCanastas = numCanastas;
    }

    public int getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(int numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public int getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(int numRebotes) {
        this.numRebotes = numRebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "Id=" + id +
                ", Nombre_Jugador='" + nombreJugador + '\'' +
                ", Fecha_Nacimiento=" + fechaNacimiento +
                ", Num_Canastas=" + numCanastas +
                ", Num_Asistencias=" + numAsistencias +
                ", Num_Rebotes=" + numRebotes +
                ", Posicion=" + posicion +
                ", Nombre_Equipo=" + equipo.getnombreEquipo() + '\'' +
                '}';
    }

}
