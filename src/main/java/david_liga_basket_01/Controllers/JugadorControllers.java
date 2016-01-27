package david_liga_basket_01.Controllers;

/**
 * Created by david on 26/01/16.
 */

import david_liga_basket_01.Model.Jugador;
import david_liga_basket_01.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/jugadores")
public class  JugadorControllers {


    @Autowired
    private JugadorRepository jugadorRepository;

    //@Autowired
    //private EquipoRepository equipoRepository;

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador); }

    @RequestMapping(method = GET)
    public List<Jugador> findAll() {
        List<Jugador> jugadors = new ArrayList<>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugadors.add(iterator.next());
        }
        //@RequestMapping
        return jugadors;

    }

    /*@RequestMapping(value = "/{idJugador}/equipos/{idEquipo}", method = POST)
    public Jugador addEquipo(@PathVariable Long idJugador, @PathVariable Long idEquipo) {

        Jugador jugador = jugadorRepository.findOne(idJugador);

        if (jugador == null)
            throw new JugadorException(idJugador);

        Equipo equipo = equipoRepository.findOne(idEquipo);

        if (equipo == null)
            throw new EquipoException(idEquipo);

        return jugador;
    }*/

}
