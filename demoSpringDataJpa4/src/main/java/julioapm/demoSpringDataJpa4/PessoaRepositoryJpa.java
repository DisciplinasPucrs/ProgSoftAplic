package julioapm.demoSpringDataJpa4;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PessoaRepositoryJpa implements PessoaRepository {
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Pessoa> buscar() {
        return entityManager
				.createQuery("select p from Pessoa p", Pessoa.class)
				.getResultList();
    }

    @Override
    public Pessoa buscar(long id) {
        return entityManager.find(Pessoa.class, id);
    }

    @Override
    public void inserir(Pessoa umaPessoa) {
        entityManager.persist(umaPessoa);
    }

    @Override
    public Pessoa remover(long id) {
        Pessoa p = entityManager.find(Pessoa.class, id);
		entityManager.remove(p);
		return p;
    }

    @Override
    public void alterar(Pessoa umaPessoa) {
        entityManager.merge(umaPessoa);
    }

}
