package app2;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarrinhoDeCompras shoppingCart = new CarrinhoDeCompras();
				
		shoppingCart.addItem("Banana", 3., 6);
		shoppingCart.addItem("Arroz", 10., 1);
		shoppingCart.exibeItems();		
		shoppingCart.removeItem("Arroz");
		shoppingCart.exibeItems();
		
		System.out.printf("Valor total R$%.2f", shoppingCart.totalValue());
	}

}
