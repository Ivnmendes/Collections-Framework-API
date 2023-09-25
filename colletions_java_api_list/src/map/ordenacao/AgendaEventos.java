package ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos{
    private Map<LocalDate, Evento> scheduleEvents;

    public AgendaEventos() {
        this.scheduleEvents = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        this.scheduleEvents.put(date, new Evento(name, attraction));
    }

    public void showSchedule() {
        Map<LocalDate, Evento> organizedEvents = new TreeMap<>(scheduleEvents);
        System.out.println(organizedEvents);
    }

    public void nextEvent() {
        LocalDate currentDate = LocalDate.now();
        for(Map.Entry<LocalDate, Evento> entry : scheduleEvents.entrySet()) {
            if(entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                System.out.println("Proximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
                break;
            }
        }
    }
}
