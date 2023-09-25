package operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("A colecao esta vazia!");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        String descricao = dicionario.get(palavra);
        if(descricao != null) {
            return descricao;
        }

        return "Palavra nao encotrada";
    }
}
