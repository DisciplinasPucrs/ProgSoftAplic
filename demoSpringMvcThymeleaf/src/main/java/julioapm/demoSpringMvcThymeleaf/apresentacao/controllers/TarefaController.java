package julioapm.demoSpringMvcThymeleaf.apresentacao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import julioapm.demoSpringMvcThymeleaf.negocio.servicos.TarefaServico;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaServico tarefaServico;

    public TarefaController(TarefaServico tarefaServico) {
        this.tarefaServico = tarefaServico;
    }

    @GetMapping
    public String consultarListaTarefas(Model model) {
        model.addAttribute("tarefas", tarefaServico.buscarTodos());
        return "tarefas";
    }
}
