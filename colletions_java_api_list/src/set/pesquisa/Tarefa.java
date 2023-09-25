package pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean conlcuida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.conlcuida = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConlcuida() {
        return conlcuida;
    }

    public void setConlcuida(boolean conlcuida) {
        this.conlcuida = conlcuida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conlcuida=" + conlcuida +
                '}';
    }
}
