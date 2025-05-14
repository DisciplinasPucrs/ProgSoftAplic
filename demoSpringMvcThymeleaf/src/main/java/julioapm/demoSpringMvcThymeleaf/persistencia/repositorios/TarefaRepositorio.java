package julioapm.demoSpringMvcThymeleaf.persistencia.repositorios;

import org.springframework.data.repository.ListCrudRepository;

import julioapm.demoSpringMvcThymeleaf.persistencia.entidades.Tarefa;

public interface TarefaRepositorio extends ListCrudRepository<Tarefa, Long> {
}
