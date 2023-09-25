package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        this.listaTarefas.remove(new Tarefa(descricao));
    }

    public void exibeTarefas() {
        if(!listaTarefas.isEmpty()) {
            for(Tarefa t : listaTarefas) {
                System.out.println(t);
            }
        } else {
            System.out.println("O conjunto esta vazio!");
        }
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!listaTarefas.isEmpty()) {
            for(Tarefa t: listaTarefas) {
                if(t.isConlcuida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("O conjunto esta vazio!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!listaTarefas.isEmpty()) {
            for(Tarefa t: listaTarefas) {
                if(!t.isConlcuida()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("O conjunto esta vazio!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!listaTarefas.isEmpty()) {
            for(Tarefa t: listaTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConlcuida(true);
                }
            }
        } else {
            System.out.println("O conjunto esta vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if(!listaTarefas.isEmpty()) {
            for(Tarefa t: listaTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConlcuida(false);
                }
            }
        } else {
            System.out.println("O conjunto esta vazio!");
        }
    }

    public void limparListaTarefas() {
        if(!listaTarefas.isEmpty()) {
            listaTarefas.clear();
        } else {
            System.out.println("O conjunto esta vazio!");
        }
    }
}
