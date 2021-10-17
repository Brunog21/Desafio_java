package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pricepage {
	WebDriver driver;

	By option = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4)");
	By btn_next = By.id("nextsendquote");

	public Pricepage(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_price() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(option).click();
		driver.findElement(btn_next).click();

	}
}
