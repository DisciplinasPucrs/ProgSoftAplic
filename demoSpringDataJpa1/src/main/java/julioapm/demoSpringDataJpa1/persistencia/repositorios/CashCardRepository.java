package julioapm.demoSpringDataJpa1.persistencia.repositorios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import julioapm.demoSpringDataJpa1.persistencia.entidades.CashCard;

public interface CashCardRepository extends ListCrudRepository<CashCard, Long>, PagingAndSortingRepository<CashCard, Long> {
    CashCard findByIdAndOwner(Long id, String owner);

    Page<CashCard> findByOwner(String owner, Pageable pageRequest);

    boolean existsByIdAndOwner(Long id, String owner);
}
