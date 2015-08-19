package springapp.web.services;

/**
 * @author ytraore
 */

import java.io.Serializable;

import springapp.web.domains.Product;

public interface ProductManager extends Serializable {

	public void increasePrince(int percentage);

	public java.util.List<Product> getProducts();
}
