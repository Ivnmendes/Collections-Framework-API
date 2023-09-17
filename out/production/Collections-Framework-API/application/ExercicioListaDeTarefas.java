package application;

public class ExercicioListaDeTarefas {
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println(listaTarefa.obterNumeroTotalTarefas());		
		listaTarefa.adicionarTarefa("Tarefa1");
		listaTarefa.adicionarTarefa("Tarefa1");
		listaTarefa.adicionarTarefa("Tarefa2");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.removeTarefa("Tarefa1");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}

}
