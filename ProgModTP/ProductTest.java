package ProgModTP;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testErrorMessage(){
		try {
			Product p = new Product();
			fail();
		} catch(Exception e) {
			assertEquals(e.getMessage(), "Cannot create empty product.");
		}
		
		String prodName = "Cigarro";
		String description = "Box of Marlboro containing 20 cigarrets";
		
		Product p = new Product(1, prodName, description, 8.5);
		
		assertEquals(p.getProductId(), 1);
		assertEquals(p.getPrice(), 8.5, 8.5);
		assertEquals(p.getProductName(), prodName);
		assertEquals(p.getProductDescription(), description);
		
		p.setPrice(9.0);
		
		assertEquals(p.getPrice(), 9.0, 9.0);
	}

}
