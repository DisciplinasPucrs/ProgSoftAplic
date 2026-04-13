package com.softaplic.demoSpringMvcThymeleaf.persistencia.repositorios;

import org.springframework.data.repository.ListCrudRepository;

import com.softaplic.demoSpringMvcThymeleaf.persistencia.entidades.Tarefa;

public interface TarefaRepositorio extends ListCrudRepository<Tarefa, Long> {

}
