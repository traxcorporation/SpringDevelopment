package springapp.web.services;

import java.util.List;

import springapp.web.domains.Product;

public class SimpleProductManager implements ProductManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Product> products;
	public void increasePrince(int percentage) {
		throw new UnsupportedOperationException();

	}

	public List<Product> getProducts() {
		throw new UnsupportedOperationException();
	}

	
	  public void setProducts(List<Product> products) {
		  this.products = products;
	    }
}
