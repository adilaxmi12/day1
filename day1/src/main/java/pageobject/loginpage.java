package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	WebDriver driver;
	By uname=By.xpath("//input[@name='uid']");
	By paasword=By.xpath("//input[@type='password']");
	By login=By.xpath("//input[@type='submit']");
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getuname() {
		return driver.findElement(uname);
				
}
	public WebElement getPassword() {
		return driver.findElement(paasword);
	}
	public Homepage clicklogin() {
driver.findElement(login).click();
return new Homepage(driver);

	}
}
