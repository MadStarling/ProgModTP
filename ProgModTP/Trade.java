package ProgModTP;
import java.util.ArrayList;
import java.util.Iterator;

class Trade {
	private ArrayList<Product> productCart;
	Vendor vendor;
	Client client;
	
	Trade() throws Exception{
		throw new Exception("Can't create a trade with no vendor or client.");
	}
	
	Trade(Client c, Vendor v){
		productCart = new ArrayList<Product>();
		client = c;
		vendor = v;
	}
	
	Trade(int productCount, Client c, Vendor v){
		productCart = new ArrayList<Product>(productCount);
		client = c;
		vendor = v;
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
