package app;

public class program1 {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cPalavrasUnicas = new ConjuntoPalavrasUnicas();

        cPalavrasUnicas.adicionarPalavra("Teste1");
        cPalavrasUnicas.adicionarPalavra("Teste2");
        cPalavrasUnicas.adicionarPalavra("Teste3");
        cPalavrasUnicas.adicionarPalavra("Teste4");
        cPalavrasUnicas.adicionarPalavra("Teste3");

        cPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println();

        cPalavrasUnicas.removerPalavra("Teste2");
        cPalavrasUnicas.removerPalavra("Teste10");

        System.out.println(cPalavrasUnicas.verificarPalavra("Teste3"));
        System.out.println(cPalavrasUnicas.verificarPalavra("Teste2"));

        cPalavrasUnicas.exibirPalavrasUnicas();
    }
}
