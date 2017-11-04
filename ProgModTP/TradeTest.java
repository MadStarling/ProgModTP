package ProgModTP;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TradeTest {

	@Test
	public void test() {
		try {
			Trade t = new Trade();
			fail("Failed to throw error.");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Can't create a trade with no vendor or client.");
		}
		
		String name1 = "Alfredo1";
		String add1 = "Casa do baralho1";
		String phone1 = "1134-5678";
		String email1 = "nadamal1@teste.com";
		Client c1 = new Client(1, name1, add1, phone1, email1);
		
		String name2 = "Alfredo2";
		String add2 = "Casa do baralho2";
		String phone2 = "1234-5678";
		String email2 = "nadamal2@teste.com";
		Client c2 = new Client(1, name2, add2, phone2, email2);
		
		String name = "Joselito";
		String compName = "Random Company";		
		Company cmp = new Company(1, compName, null);
		Vendor v = new Vendor(1, name, cmp);
		
		Product heineken = new Product(1, "Heineken", "Regular beer", 9.0);
		Product skol = new Product(2, "Skol", "Bad beer", 6.5);
		Product eisenbahn = new Product(3, "Eisenbahn", "Good beer", 8.5);
		Product marlboro= new Product(4, "Marlboro", "A real good pack of cigarrets", 8.5);
		
		Trade t1 = new Trade(c1, v);
		Trade t2 = new Trade(2, c2, v);
		
		t1.addProduct(heineken);
		t1.addProduct(skol);
		t1.addProduct(eisenbahn);
		t1.addProduct(marlboro);
		
		try{ t1.removeProduct(skol); } catch(Exception e) { fail("Should not have thrown error."); };
		
		t2.addProduct(heineken);
		t2.addProduct(eisenbahn);
		t2.addProduct(marlboro);
		
		try{ t2.removeProduct(skol); } catch(Exception e) { assertEquals(e.getMessage(), "Produto não consta na lista."); };
	}

}
