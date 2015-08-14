package springapp.web.domains;

import junit.framework.TestCase;

public class ProductsTest extends TestCase {

	private Product products;
	protected void setUp() throws Exception {
		 products = new Product();
		super.setUp();
	}

	public void testGetSetDescription() {
		String testDescrition = "aDescription"; // TODO
		assertNull(products.getDescription());
		products.setDescription(testDescrition);
		assertEquals(testDescrition, products.getDescription());
	}

	public void testSetPrice() {
		Double testPrice = 1000.01; // TODO
		assertNull(products.getPrice());
		products.setPrice(testPrice);
		assertEquals(testPrice,products.getPrice());
		
	}


}
