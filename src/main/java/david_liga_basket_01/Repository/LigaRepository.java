package david_liga_basket_01.Repository;

import david_liga_basket_01.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by david on 26/01/16.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {
}
