package julioapm.demoSpringDataJpa4;

import java.util.List;

public interface PessoaRepository {
    List<Pessoa> buscar();
	Pessoa buscar(long id);
	void inserir(Pessoa umaPessoa);
	Pessoa remover(long id);
	void alterar(Pessoa umaPessoa);
}
