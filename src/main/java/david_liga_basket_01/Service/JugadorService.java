package david_liga_basket_01.Service;

import david_liga_basket_01.Model.Jugador;
import david_liga_basket_01.Repository.EquipoRepository;
import david_liga_basket_01.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by david on 26/01/16.
 */
@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public JugadorService testJugador(){

        Calendar cal=Calendar.getInstance();

        cal.set(1995,Calendar.JULY,25);
        Date birthDate1=cal.getTime();

        Jugador jugador1 = new Jugador();
        jugador1.setNombreJugador("Jorge");
        jugador1.setFechaNacimiento(birthDate1);
        jugador1.setNumCanastas(20);
        jugador1.setNumAsistencias(35);
        jugador1.setNumRebotes(5);
        jugador1.setPosicion("Alero");
        jugador1.setEquipo(equipoRepository.findByNombreEquipo("FC Barcelona"));
        jugadorRepository.save(jugador1);

        cal.set(1994,Calendar.JULY,31);
        Date birthDate2=cal.getTime();

        Jugador jugador2 = new Jugador();
        jugador2.setNombreJugador("Luis");
        jugador2.setFechaNacimiento(birthDate2);
        jugador2.setNumAsistencias(25);
        jugador2.setNumCanastas(35);
        jugador2.setNumRebotes(15);
        jugador2.setPosicion("Base");
        jugador2.setEquipo(equipoRepository.findByNombreEquipo("Real Madrid"));
        jugadorRepository.save(jugador2);

        cal.set(1994,Calendar.MARCH, 9);
        Date birthDate3=cal.getTime();

        Jugador jugador3 = new Jugador();
        jugador3.setNombreJugador("Angel");
        jugador3.setFechaNacimiento(birthDate3);
        jugador3.setNumAsistencias(27);
        jugador3.setNumCanastas(32);
        jugador3.setNumRebotes(18);
        jugador3.setPosicion("Alero");
        jugador3.setEquipo(equipoRepository.findByNombreEquipo("FC Barcelona"));
        jugadorRepository.save(jugador3);

        cal.set(1993,Calendar.JULY, 19);
        Date birthDate4=cal.getTime();

        Jugador jugador4 = new Jugador();
        jugador4.setNombreJugador("Pedro");
        jugador4.setFechaNacimiento(birthDate4);
        jugador4.setNumAsistencias(29);
        jugador4.setNumCanastas(38);
        jugador4.setNumRebotes(20);
        jugador4.setPosicion("Alero");
        jugador4.setEquipo(equipoRepository.findByNombreEquipo("Juventud"));
        jugadorRepository.save(jugador4);

        cal.set(1993, Calendar.JULY, 19);
        Date birthDate5=cal.getTime();

        Jugador jugador5 = new Jugador();
        jugador5.setNombreJugador("Daniel");
        jugador5.setFechaNacimiento(birthDate5);
        jugador5.setNumAsistencias(39);
        jugador5.setNumCanastas(40);
        jugador5.setNumRebotes(28);
        jugador5.setPosicion("Pivot");
        jugador5.setEquipo(equipoRepository.findByNombreEquipo("Real Madrid"));
        jugadorRepository.save(jugador5);

        System.out.println(jugadorRepository.findByNombreJugadorContaining("Jo"));
        System.out.println(jugadorRepository.findByNumCanastasGreaterThan(5));
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(10,5));
        System.out.println(jugadorRepository.findByPosicionIs("Base"));
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(cal.getTime()));
        System.out.println(jugadorRepository.findByFechaNacimientoBeforeAndNumCanastasGreaterThanEqual(cal.getTime(),25));

        return null;
    }
}
