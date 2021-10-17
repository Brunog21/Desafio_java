package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Insurantpage {

	WebDriver driver;
	By first_name = By.id("firstname");
	By last_name = By.id("lastname");
	By birth = By.id("birthdate");
	By gender = By.cssSelector("div:nth-child(4) > p > label:nth-child(1)");
	By street = By.id("streetaddress");
	By country = By.id("country");
	By zipcode = By.id("zipcode");
	By city = By.id("city");
	By hobby = By.cssSelector(".ideal-radiocheck-label:nth-child(5)");
	By btn_next = By.id("nextenterproductdata");

	public Insurantpage(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_insurant() {
		driver.findElement(first_name).sendKeys("Bruno");
		driver.findElement(last_name).sendKeys("Galvagni");
		driver.findElement(birth).sendKeys("03/11/2001");
		driver.findElement(gender).click();
		driver.findElement(street).sendKeys("Frei Caneca");
		driver.findElement(country).sendKeys("Brazil");
		driver.findElement(zipcode).sendKeys("99070090");
		driver.findElement(city).sendKeys("Passo Fundo");
		Select job = new Select(driver.findElement(By.id("occupation")));
		job.selectByVisibleText("Employee");
		driver.findElement(hobby).click();
		driver.findElement(btn_next).click();
	}
}
