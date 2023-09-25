package pesquisa;

public class Application2 {
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.addWord("Java", 2);
        contagemLinguagens.addWord("Python", 8);
        contagemLinguagens.addWord("JavaScript", 1);
        contagemLinguagens.addWord("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.showWordsCount() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.findMostFrequentWord();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente + " vezes");

        // Remove uma palavra e exibe a contagem
        contagemLinguagens.removeWord("C#");
        System.out.println("Existem " + contagemLinguagens.showWordsCount() + " palavras.");
    }
}
