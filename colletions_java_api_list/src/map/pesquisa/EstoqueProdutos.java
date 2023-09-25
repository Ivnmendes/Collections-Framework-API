package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> productStock;

    public EstoqueProdutos() {
        this.productStock = new HashMap<>();
    }

    public void addProduct(long id, String name, int quantity, double price) {
        this.productStock.put(id, new Produto(name, quantity, price));
    }

    public void showProducts() {
        System.out.println(productStock);
    }

    public double calcStockValue() {
        double value = 0;
        if(!productStock.isEmpty()) {
            for(Produto p : productStock.values()) {
                value += p.getQuantity() * p.getPrice();
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return value;
    }

    public Produto getCheapestProduct() {
        Produto cheapestProduct = null;
        double cheapestPrice = Double.MAX_VALUE;
        if(!productStock.isEmpty()) {
            for(Produto p : productStock.values()) {
                if(p.getPrice() < cheapestPrice) {
                    cheapestProduct = p;
                    cheapestPrice = p.getPrice();
                }
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return cheapestProduct;
    }

    public Produto getExpensiveProduct() {
        Produto expensiveProduct = null;
        double expensivePrice = 0;
        if(!productStock.isEmpty()) {
            for(Produto p : productStock.values()) {
                if(p.getPrice() > expensivePrice) {
                    expensiveProduct = p;
                    expensivePrice = p.getPrice();
                }
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return expensiveProduct;
    }

    public Produto getGreaterAndExpensiveProduct() {
        Produto greaterAndExpensiveProduct = null;
        double greaterExpensiveStock = 0;
        if(!productStock.isEmpty()) {
            for(Produto p : productStock.values()) {
                if(p.getPrice() * p.getQuantity() > greaterExpensiveStock) {
                    greaterAndExpensiveProduct = p;
                    greaterExpensiveStock = p.getPrice() * p.getQuantity();
                }
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return greaterAndExpensiveProduct;
    }
}
