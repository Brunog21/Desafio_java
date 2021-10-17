package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Productpage {
	WebDriver driver;

	By date = By.id("startdate");
	By sum = By.id("insurancesum");
	By courtesy = By.id("courtesycar");
	By optional_products = By.cssSelector(
			"section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	By optinal_products2 = By.cssSelector(
			"section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");
	By btn_next = By.id("nextselectpriceoption");

	public Productpage(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_product() {
		driver.findElement(date).sendKeys("01/19/2023");
		driver.findElement(sum).sendKeys("15.000.000,00");
		Select merit = new Select(driver.findElement(By.id("meritrating")));
		merit.selectByVisibleText("Bonus 4");
		Select damage = new Select(driver.findElement(By.id("damageinsurance")));
		damage.selectByVisibleText("Partial Coverage");
		driver.findElement(optional_products).click();
		driver.findElement(optinal_products2).click();
		driver.findElement(courtesy).sendKeys("yes");
		driver.findElement(btn_next).click();

	}
}
