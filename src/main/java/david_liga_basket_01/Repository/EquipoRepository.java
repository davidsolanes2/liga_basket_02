package david_liga_basket_01.Repository;

import david_liga_basket_01.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by david on 26/01/16.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {
    Equipo findByNombreEquipo(String nombre);

}
