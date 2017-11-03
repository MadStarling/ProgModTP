package ProgModTP;
import java.util.ArrayList;
import java.util.Iterator;

class Trade {
	private ArrayList<Product> productCart;
	
	Trade(int productCount){
		productCart = new ArrayList<Product>(productCount);
	}
	
	public void addProduct(Product p) {
		productCart.add(p);
	}
	
	public void removeProduct(Product p) throws Exception{
		int index = productCart.indexOf(p);
		if(index == -1) {
			throw new Exception("Produto não consta na lista.");
		} else {
			productCart.remove(index);
		}
	}
}
