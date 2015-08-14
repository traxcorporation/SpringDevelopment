package springapp.web.services;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import springapp.web.domains.Product;

public class SimpleProductManagerTest extends TestCase {

	private SimpleProductManager simpleProductManager;

	protected void setUp() throws Exception {
		super.setUp();
		simpleProductManager = new SimpleProductManager();
		List<Product> products;

		int PRODUCTS_COUNT = 2;
		Double CHAIRE_PRICE = new Double(20.50);
		String CHAIRE_DESCRIPTION = "Chair";

		Double TABLE_PRICE = new Double(150.10);
		String TABLE_DESCRIPTION = "Table";

		products = new ArrayList<Product>();

		// Ajout de tous les produits
		final Product productChaire = new Product();
		productChaire.setDescription(CHAIRE_DESCRIPTION);
		productChaire.setPrice(CHAIRE_PRICE);
		products.add(productChaire);

		final Product productTable = new Product();
		productTable.setDescription(TABLE_DESCRIPTION);
		productTable.setPrice(TABLE_PRICE);
		products.add(productTable);

		simpleProductManager.setProducts(products);
	}

	public void testGetProductsWithNoProducts() {
		assertNull(simpleProductManager.getProducts());
	}

}
