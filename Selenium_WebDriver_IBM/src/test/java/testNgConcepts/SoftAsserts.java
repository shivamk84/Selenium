package testNgConcepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {

	@Test
	public void testCase1() {
		int ExpLinks = 10;
		int ActLinks = 12; // selenium code

		SoftAssert softAssert = new SoftAssert();

		System.out.println("A");

		softAssert.assertEquals(ActLinks, ExpLinks);
		System.out.println("B");
		softAssert.assertAll();

	}

}
