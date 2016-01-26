package david_liga_basket_01;

import david_liga_basket_01.Repository.EquipoRepository;
import david_liga_basket_01.Repository.JugadorRepository;
import david_liga_basket_01.Repository.LigaRepository;
import david_liga_basket_01.Repository.TemporadaRepository;
import david_liga_basket_01.Service.EquipoService;
import david_liga_basket_01.Service.JugadorService;
import david_liga_basket_01.Service.LigaService;
import david_liga_basket_01.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.expression.ParseException;

@SpringBootApplication
@EnableJpaRepositories
public class LigaBasket01Application {

	private static EquipoRepository equipoRepository;
	private static JugadorRepository jugadorRepository;
	private static TemporadaRepository temporadaRepository;
	private static LigaRepository ligaRepository;
	private static EquipoService equipoService;
	private static JugadorService jugadorService;
	private static LigaService ligaService;
	private static TemporadaService temporadaService;

	public static void main(String[] args) throws ParseException {

		ConfigurableApplicationContext context = SpringApplication.run(LigaBasket01Application.class, args);

		equipoRepository = context.getBean(EquipoRepository.class);
		jugadorRepository = context.getBean(JugadorRepository.class);
		temporadaRepository = context.getBean(TemporadaRepository.class);
		ligaRepository = context.getBean(LigaRepository.class);
		equipoService = context.getBean(EquipoService.class);
		equipoService = equipoService.testEquipo();
		jugadorService = context.getBean(JugadorService.class);
		jugadorService = jugadorService.testJugador();
		ligaService = context.getBean(LigaService.class);
		ligaService = ligaService.testLiga();
		temporadaService = context.getBean(TemporadaService.class);
		temporadaService = temporadaService.testTemporada();
	}
}
