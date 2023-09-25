package pesquisa;

public class Application {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.showProducts();

        // Adiciona produtos ao estoque
        estoque.addProduct(1L, "Notebook", 1, 1500.0);
        estoque.addProduct(2L, "Mouse", 5, 25.0);
        estoque.addProduct(3L, "Monitor", 10, 400.0);
        estoque.addProduct(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.showProducts();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcStockValue());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.getExpensiveProduct();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.getCheapestProduct();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.getGreaterAndExpensiveProduct();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
