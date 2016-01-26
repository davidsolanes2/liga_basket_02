package david_liga_basket_01.Service;

import david_liga_basket_01.Model.Temporada;
import david_liga_basket_01.Repository.EquipoRepository;
import david_liga_basket_01.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;

/**
 * Created by david on 26/01/16.
 */

@Service
@Transactional
public class TemporadaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public TemporadaService testTemporada() {
        Temporada temporada1 = new Temporada();
        Calendar calendar = Calendar.getInstance();

        calendar.set(2010, Calendar.SEPTEMBER, 15);
        temporada1.setFechaInicio(calendar.getTime());
        calendar.set(2011, Calendar.JULY, 30);
        temporada1.setFechaFin(calendar.getTime());
        temporada1.getEquipos().add(equipoRepository.findOne(1L));
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada();
        calendar.set(2011, Calendar.SEPTEMBER, 15);
        temporada2.setFechaInicio(calendar.getTime());
        calendar.set(2012, Calendar.JULY, 30);
        temporada2.setFechaFin(calendar.getTime());
        temporada2.getEquipos().add(equipoRepository.findOne(2L));
        temporadaRepository.save(temporada2);

        return null;
    }
}
