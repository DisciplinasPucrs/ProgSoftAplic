package julioapm.demoSpringDataJpa4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringDataJpa4Application {
	private static final Logger log = LoggerFactory.getLogger(DemoSpringDataJpa4Application.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataJpa4Application.class, args);
	}

	@Bean
	public CommandLineRunner run(PessoaRepository pessoaRepository) {
		return args -> {
			log.info("Inserindo pessoas...");
			pessoaRepository.inserir(new Pessoa("Teste", 1));
			log.info("Alterando pessoa...");
			Pessoa p = pessoaRepository.buscar(1);
			p.setNome("Teste Alterado");
			pessoaRepository.alterar(p);
			log.info("Consultando pessoas...");
			pessoaRepository.buscar().forEach(pessoa -> log.info(pessoa.toString()));
		};
	}
}
