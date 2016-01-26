package david_liga_basket_01.Repository;

import david_liga_basket_01.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by david on 26/01/16.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long> {

    public List<Jugador> findByNombreJugadorContaining(String nombreJugador);
    public List<Jugador> findByNumCanastasGreaterThan(int numCanastas);
    public List<Jugador> findByNumAsistenciasBetween(int minnumAsistencias, int maxnumAsistencias);
    public List<Jugador> findByPosicionIs(String posicion);
    public List<Jugador> findByFechaNacimientoBefore(Date fechaNacimiento);
    public List<Jugador> findByFechaNacimientoBeforeAndNumCanastasGreaterThanEqual(Date fechaNacimiento, int numCanastas);

}
