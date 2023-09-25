package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> wordCount;

    public ContagemPalavras() {
        this.wordCount = new HashMap<>();
    }

    public void addWord(String word, Integer count) {
        this.wordCount.put(word, count);
    }

    public void removeWord(String word) {
        if(!wordCount.isEmpty()) {
            if(wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) -1);
            }
        } else {
            System.out.println("O conjuto esta vazio!");
        }
    }

    public int showWordsCount() {
        int totalCount = 0;
        for (int contagem : wordCount.values()) {
            totalCount += contagem;
        }
        return totalCount;
    }

    public String findMostFrequentWord() {
        String mostFrequentWord = null;
        int frequency = 0;
        if(!wordCount.isEmpty()) {
            for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if(entry.getValue() > frequency) {
                    mostFrequentWord = entry.getKey();
                    frequency = entry.getValue();
                }
            }
            mostFrequentWord += " " + frequency;
        } else {
            System.out.println("O conjunto esta vazio");
        }

        return mostFrequentWord;
    }
}
