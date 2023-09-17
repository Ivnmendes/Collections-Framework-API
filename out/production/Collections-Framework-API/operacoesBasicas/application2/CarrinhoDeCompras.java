package application2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> shoppingCart;

	public CarrinhoDeCompras() {
		this.shoppingCart = new ArrayList<Item>();
	}
	
	public void addItem(String name, double value, int quantity) {
		this.shoppingCart.add(new Item(name,value,quantity));
	}
	public void removeItem(String name) {
		List<Item> itemsToRemove = new ArrayList<>();
		for(Item i : this.shoppingCart) {
			if(i.getName().equalsIgnoreCase(name)) {
				itemsToRemove.add(i);
			}
		}
		this.shoppingCart.removeAll(itemsToRemove);
	}
	public double totalValue() {
		double value = 0;
		for(Item i : this.shoppingCart) {
			value += i.getValue() * i.getQuantity();
		}
		return value;
	}
	public void exibeItems() {
		for(Item i : this.shoppingCart) {
			System.out.println(i);
		}
	}
}
