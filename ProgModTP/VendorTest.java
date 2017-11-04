package ProgModTP;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class VendorTest {

	@Test
	public void test() {
		try {
			Vendor v = new Vendor();
			fail("Failed to show error message");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Cannot create empty Person.");
		}
		
		String name = "Joselito";
		
		String compName = "Random Company";		
		Company cmp = new Company(1, compName, null);
		
		Vendor v = new Vendor(1, name, cmp);
		
		assertEquals(v.getId(), 1);
		assertEquals(v.getName(), name);
		assertEquals(v.getCompany(), cmp);
	}

}
