package david_liga_basket_01.Service;

import david_liga_basket_01.Model.Liga;
import david_liga_basket_01.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by david on 26/01/16.
 */

@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    public LigaService testLiga(){

        Liga liga1 = new Liga();
        liga1.setNombreLiga("Liga ACB");
        ligaRepository.save(liga1);

        return null;
    }


}
