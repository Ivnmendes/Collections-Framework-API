package ordenacao;

public class Evento {
    private String name;
    private String attraction;

    public Evento(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "name='" + name + '\'' +
                ", attraction='" + attraction + '\'' +
                '}';
    }
}
