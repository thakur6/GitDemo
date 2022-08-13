package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Homepage;

public class HomeTest extends BaseTest {
	Homepage hp;
	SoftAssert sa;
	

	@BeforeClass
	public void initObject() {
		
		
		 sa=new SoftAssert();
		hp=new Homepage(driver);
	}
	
	@Test (priority=1)
	public void goToTab() {
		
		hp.adminMenu();
		sa.assertFalse(true);
		sa.assertAll();
	}
	@Test (priority=2)
	public void logout() {
		
		
		hp.logout();
	}
}
