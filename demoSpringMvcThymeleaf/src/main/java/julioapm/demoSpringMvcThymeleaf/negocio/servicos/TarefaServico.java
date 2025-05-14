package julioapm.demoSpringMvcThymeleaf.negocio.servicos;

import java.util.List;

import org.springframework.stereotype.Service;

import julioapm.demoSpringMvcThymeleaf.negocio.dtos.TarefaDTO;
import julioapm.demoSpringMvcThymeleaf.persistencia.entidades.Tarefa;
import julioapm.demoSpringMvcThymeleaf.persistencia.repositorios.TarefaRepositorio;

@Service
public class TarefaServico {
    private final TarefaRepositorio tarefaRepositorio;

    public TarefaServico(TarefaRepositorio tarefaRepositorio) {
        this.tarefaRepositorio = tarefaRepositorio;
    }

    private TarefaDTO converterParaDTO(Tarefa tarefa) {
        TarefaDTO tarefaDTO = new TarefaDTO();
        tarefaDTO.setId(tarefa.getId());
        tarefaDTO.setDescricao(tarefa.getDescricao());
        tarefaDTO.setConcluida(tarefa.isConcluida());
        return tarefaDTO;
    }

    public TarefaDTO buscarPorId(Long id) {
        Tarefa tarefa = tarefaRepositorio.findById(id).orElse(null);
        return tarefa != null ? converterParaDTO(tarefa) : null;
    }

    public List<TarefaDTO> buscarTodos() {
        List<Tarefa> tarefas = tarefaRepositorio.findAll();
        return tarefas.stream().map(this::converterParaDTO).toList();
    }

}
