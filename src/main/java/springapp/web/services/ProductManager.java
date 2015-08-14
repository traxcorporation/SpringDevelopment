package springapp.web.services;

import java.io.Serializable;

import springapp.web.domains.Product;

public interface ProductManager extends Serializable {

	public void increasePrince(int percentage);

	public java.util.List<Product> getProducts();
}
