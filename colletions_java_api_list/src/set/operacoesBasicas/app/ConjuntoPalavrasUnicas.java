package app;

import java.util.Set;
import java.util.HashSet;
public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraPRemover = null;
        if(!conjuntoPalavrasUnicas.isEmpty()) {
            for(String p : conjuntoPalavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraPRemover = p;
                }
            }
        }

        conjuntoPalavrasUnicas.remove(palavraPRemover);
    }

    public boolean verificarPalavra(String palavra) {
        boolean presente = false;
        if(!conjuntoPalavrasUnicas.isEmpty()) {
            for(String p : conjuntoPalavrasUnicas) {
                if(p.equalsIgnoreCase(palavra)) {
                    presente = true;
                }
            }
        }

        return presente;
    }

    public void exibirPalavrasUnicas() {
        if(!conjuntoPalavrasUnicas.isEmpty()) {
            for(String p : conjuntoPalavrasUnicas) {
                System.out.print(p + " ");
            }
        }
    }
}
