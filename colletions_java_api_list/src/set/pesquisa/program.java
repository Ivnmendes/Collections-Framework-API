package pesquisa;


public class program {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Teste 1");
        listaTarefas.adicionarTarefa("Teste 2");
        listaTarefas.adicionarTarefa("Teste 2");
        listaTarefas.adicionarTarefa("Teste 3");
        listaTarefas.adicionarTarefa("Teste 4");
        listaTarefas.adicionarTarefa("Teste 5");

        listaTarefas.exibeTarefas();
        System.out.println(listaTarefas.contarTarefas() + "\n");

        listaTarefas.removerTarefa("Teste 3");

        listaTarefas.marcarTarefaConcluida("Teste 2");
        listaTarefas.marcarTarefaConcluida("Teste 5");
        listaTarefas.marcarTarefaConcluida("Teste 1");
        listaTarefas.marcarTarefaPendente("Teste 1");

        listaTarefas.exibeTarefas();
        System.out.println(listaTarefas.contarTarefas() + "\n");

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibeTarefas();
        System.out.println(listaTarefas.contarTarefas() + "\n");
    }
}
