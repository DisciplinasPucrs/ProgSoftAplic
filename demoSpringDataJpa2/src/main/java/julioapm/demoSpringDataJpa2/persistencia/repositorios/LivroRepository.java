package julioapm.demoSpringDataJpa2.persistencia.repositorios;

import org.springframework.data.repository.ListCrudRepository;

import julioapm.demoSpringDataJpa2.persistencia.entidades.Livro;

public interface LivroRepository extends ListCrudRepository<Livro, Long> {

}
