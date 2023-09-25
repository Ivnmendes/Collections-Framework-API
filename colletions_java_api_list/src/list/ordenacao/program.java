package ordenacao;

public class program {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.addPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.addPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.addPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.addPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
