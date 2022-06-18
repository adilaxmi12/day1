package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	By title=By.xpath("//h2[text()='Guru99 Bank']");
	public WebElement  getTitle() {
		return driver.findElement(title);
		
	}

}
