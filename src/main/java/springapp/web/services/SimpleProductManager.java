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
		if (products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue() * (10 + percentage) / 100;
				product.setPrice(newPrice);
			}
		}
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
