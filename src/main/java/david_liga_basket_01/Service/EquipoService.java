package david_liga_basket_01.Service;

import david_liga_basket_01.Model.Equipo;
import david_liga_basket_01.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by david on 26/01/16.
 */
@Service
@Transactional
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public EquipoService testEquipo(){

        Equipo equipo1 = new Equipo();
        equipo1.setnombreEquipo("Real Madrid");
        equipo1.setnombreEstadio("Pabellon Barclays");
        equipo1.setlocalidad("Madrid");
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setnombreEquipo("FC Barcelona");
        equipo2.setnombreEstadio("Mini Estadi");
        equipo2.setlocalidad("Barcelona");
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setnombreEquipo("Juventud");
        equipo3.setnombreEstadio("Polideportivo Badalona");
        equipo3.setlocalidad("Badalona");
        equipoRepository.save(equipo3);
        return null;
    }
}
