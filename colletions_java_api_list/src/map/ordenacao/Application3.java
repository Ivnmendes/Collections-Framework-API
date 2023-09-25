package ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Application3 {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.addEvent(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.addEvent(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.addEvent(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.addEvent(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.addEvent(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.showSchedule();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.nextEvent();
    }
}
