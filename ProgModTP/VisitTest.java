package ProgModTP;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VisitTest {

	@Test
	public void test() {
		String name = "Alfredo";
		String add = "Casa do baralho";
		String phone = "1134-5678";
		String email = "nadamal@teste.com";
		Client c = new Client(1, name, add, phone, email);
		
		String vendName = "Joselito";
		String compName = "Random Company";		
		Company cmp = new Company(1, compName, null);
		Vendor vend = new Vendor(1, vendName, cmp);
		
		Visit v = new Visit(vend, c, c.getAddress(), "28-11-2017 23:44");
		
		assertEquals(v.getAddress(), c.getAddress());
		assertEquals(v.getClient(), c);
		assertEquals(v.getDatetime(), "28-11-2017 23:44");
		assertEquals(v.getVendor(), vend);
	}

}
