package ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos{
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        listaAlunos.add(new Aluno(nome, matricula, nota));
    }
    public void removerAluno(long matricula) {
        if(!listaAlunos.isEmpty()) {
            for(Aluno a : listaAlunos) {
                if(a.getMatricula() == matricula) {
                    listaAlunos.remove(a);
                    break;
                }
            }
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        if(listaAlunos.isEmpty()) {
            System.out.println("A lista esta vazia");
        }

        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(listaAlunos.isEmpty()) {
            System.out.println("A lista esta vazia");
        } else {
            alunosPorNota.addAll(listaAlunos);
        }

        return alunosPorNota;
    }

    public void exibirAlunos() {
        if(!listaAlunos.isEmpty()) {
            for(Aluno a: listaAlunos) {
                System.out.println(a);
            }
        } else {
            System.out.println("A lista esta vazia");
        }
    }
}
