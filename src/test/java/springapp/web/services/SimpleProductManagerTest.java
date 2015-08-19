package springapp.web.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;
import springapp.web.domains.Product;

public class SimpleProductManagerTest extends TestCase {

	private static final int PRODUCTS_COUNT = 2;
	private static final String CHAIRE_DESCRIPTION = "Chair";
	private static final String TABLE_DESCRIPTION = "Table";
	private static final Double CHAIRE_PRICE = new Double(20.50);
	private static final Double TABLE_PRICE = new Double(150.10);
	private static final int POSITIVE_PRICE_INCREASE = 10;
	private SimpleProductManager simpleProductManager;

	protected void setUp() throws Exception {
		super.setUp();
		simpleProductManager = new SimpleProductManager();
		List<Product> productsList;

		// Ajout de tous les produits
		productsList = new ArrayList<Product>();
		Product product = new Product();

		product.setDescription(CHAIRE_DESCRIPTION);
		product.setPrice(CHAIRE_PRICE);
		productsList.add(product);

		product.setDescription(TABLE_DESCRIPTION);
		product.setPrice(TABLE_PRICE);
		productsList.add(product);

		simpleProductManager.setProducts(productsList);
	}

	@Test
	public void testGetProductsWithNoProducts() {
		simpleProductManager = new SimpleProductManager();
		assertNull(simpleProductManager.getProducts());
	}

	@Test
	public void tesGetProducts() {
		List<Product> products = simpleProductManager.getProducts();
		assertNotNull(products);
		assertEquals(PRODUCTS_COUNT, simpleProductManager.getProducts().size());

		Product product = products.get(0);
		assertEquals(CHAIRE_DESCRIPTION, product.getDescription());
		assertEquals(CHAIRE_PRICE, product.getPrice());

		product = products.get(1);
		assertEquals(TABLE_DESCRIPTION, product.getDescription());
		assertEquals(TABLE_PRICE, product.getPrice());
	}

	@Test
	public void testIncreasePriceWithNullListOfProducts() {
		try {
			simpleProductManager = new SimpleProductManager();
			simpleProductManager.increasePrince(POSITIVE_PRICE_INCREASE);
		} catch (NullPointerException ex) {
			fail("Products list is null");
		}
	}

	@Test
	public void testIncreasePriceWithEmptyListOfProducts() {
		try {
			simpleProductManager = new SimpleProductManager();
			simpleProductManager.setProducts(new ArrayList<Product>());
			simpleProductManager.increasePrince(POSITIVE_PRICE_INCREASE);
		} catch (Exception ex) {
			fail("Products list is empty");
		}
	}

	@Test
	public void testIncreasePriceWithPositivePercentage() {
		simpleProductManager.increasePrince(POSITIVE_PRICE_INCREASE);
		final double expectedChairPriceWithIncrease = 22.55;
		final double expectedTablePriceWithIncrease = 165.11;

		Product product;
		List<Product> products = simpleProductManager.getProducts();

		product = products.get(0);
		assertEquals(expectedChairPriceWithIncrease, product.getPrice());

		product = products.get(1);
		assertEquals(expectedTablePriceWithIncrease, product.getPrice());
	}
}
