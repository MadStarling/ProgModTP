package ProgModTP;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test() {
		try {
			Client c = new Client();
			fail("Failed to show message");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Cannot create empty Person.");
		}
		
		String name = "Alfredo";
		String add = "Casa do baralho";
		String phone = "1234-5678";
		String email = "nadamal@teste.com";
		
		Client c = new Client(1, name, add, phone, email);
		
		assertEquals(c.getAddress(), add);
		assertEquals(c.getEmail(), email);
		assertEquals(c.getId(), 1);
		assertEquals(c.getName(), name);
		assertEquals(c.getPhoneNumber(), phone);
		
		add = "Casa dois";
		c.setAddress(add);
		assertEquals(c.getAddress(), add);
		
		email = "jose@another.com";
		c.setEmail(email);
		assertEquals(c.getEmail(), email);
		
		phone = "1111-2222";
		c.setPhoneNumber(phone);
		assertEquals(c.getPhoneNumber(), phone);
	}

}
