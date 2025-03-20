package julioapm.demoSpringDataJpa2.persistencia.repositorios;

import org.springframework.data.repository.ListCrudRepository;

import julioapm.demoSpringDataJpa2.persistencia.entidades.Autor;

public interface AutorRepository extends ListCrudRepository<Autor, Long> {

}
