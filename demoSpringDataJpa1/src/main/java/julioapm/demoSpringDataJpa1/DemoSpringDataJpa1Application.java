package julioapm.demoSpringDataJpa1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import julioapm.demoSpringDataJpa1.persistencia.entidades.CashCard;
import julioapm.demoSpringDataJpa1.persistencia.repositorios.CashCardRepository;

@SpringBootApplication
public class DemoSpringDataJpa1Application {

	private static final Logger log = LoggerFactory.getLogger(DemoSpringDataJpa1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataJpa1Application.class, args);
	}

	@Bean
	public CommandLineRunner dmeo(CashCardRepository cashCardRepository) {
		return (args) -> {
			log.info("Saving CashCards");
			log.info("-------------------------------");
			CashCard savedCashCard = cashCardRepository.save(new CashCard(null, 123.45, "sarah1"));
			log.info(savedCashCard.toString());
			savedCashCard = cashCardRepository.save(new CashCard(null, 1.00, "sarah1"));
			log.info(savedCashCard.toString());
			savedCashCard = cashCardRepository.save(new CashCard(null, 150.00, "sarah1"));
			log.info(savedCashCard.toString());
			savedCashCard = cashCardRepository.save(new CashCard(null, 200.00, "kumar2"));
			log.info(savedCashCard.toString());
			log.info("");
						
			log.info("CashCards found with findAll():");
			log.info("-------------------------------");
			cashCardRepository.findAll().forEach(cashCard -> {
				log.info(cashCard.toString());
			});
			log.info("");

			cashCardRepository.findById(1L).ifPresent(cashCard -> {
				log.info("CashCard found with findById(1L):");
				log.info("--------------------------------");
				log.info(cashCard.toString());
				log.info("");
			});

			log.info("CashCards found with findByOwner('sarah1'):");
			log.info("--------------------------------------------");
			Page<CashCard> page = cashCardRepository.findByOwner("sarah1", PageRequest.of(0, 2));
			page.forEach(cashCard -> {
				log.info(cashCard.toString());
			});
			log.info("");


		};
	}
}
