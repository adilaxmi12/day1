package Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.loginpage;
import resources.base;

public class TC_LoginPage extends base{
	Homepage hp;
	@Test(dataProvider="getData")
	public void loginData(String uname, String password) {
		loginpage lp=new loginpage(driver);
		lp.getuname().sendKeys(uname);
		lp.getPassword().sendKeys(password);
	     hp = lp.clicklogin();
	     String titl = hp.getTitle().getText();
	     Assert.assertEquals(titl, "Guru99 Bank");

	     
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="mngr404077";
		data[0][1]="123456";
		data[1][0]="128963";
		data[1][1]="nybUmes";
		data[2][0]="mngr404077";
		data[2][1]="nybUmes";
		return data;

	}
	
	

}
