package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listPessoasOrdenadoPIdade = new ArrayList<>(pessoaList);
        Collections.sort(listPessoasOrdenadoPIdade);
        return listPessoasOrdenadoPIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listPessoasOrdeandoPAltura = new ArrayList<>(pessoaList);
        Collections.sort(listPessoasOrdeandoPAltura, new ComparatorPorAltura());
        return listPessoasOrdeandoPAltura;
    }
}
