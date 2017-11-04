package ProgModTP;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CompanyTest {

	@Test
	public void test() {
		try {
			Company c = new Company();
			fail("Failed to throw Exception");
		} catch(Exception e) {
			assertEquals(e.getMessage(), "Cannot create empty Company.");
		}
		String name1 = "Random Company";
		String name2 = "Random Company2";
		
		Company c = new Company(1, name1, null);
		
		assertEquals(c.getCompanyId(), 1);
		assertEquals(c.getCompanyName(), name1);
		
		c.setCompanyName(name2);
		
		assertFalse(c.getCompanyName() == name1);
		assertEquals(c.getCompanyName(), name2);
	}

}
