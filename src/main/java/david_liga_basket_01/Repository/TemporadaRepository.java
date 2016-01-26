package david_liga_basket_01.Repository;

import david_liga_basket_01.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by david on 26/01/16.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {
    Temporada findByNombre(String nombre);

}
