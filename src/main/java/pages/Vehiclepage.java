package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Vehiclepage {

	WebDriver driver;

	By performace = By.id("engineperformance");
	By cylinder = By.id("cylindercapacity");
	// By make=By.id("make");
	By model = By.id("model");
	By date = By.id("dateofmanufacture");
	By hand_drive = By.cssSelector(".ideal-radio");
	By seats = By.id("numberofseatsmotorcycle");
	By fuel = By.id("fuel");
	By payload = By.id("payload");
	By weight = By.id("totalweight");
	By price = By.id("listprice");
	By plate = By.id("licenseplatenumber");
	By mileage = By.id("annualmileage");
	By btn_next = By.id("nextenterinsurantdata");
	By txtteste = By.id("selectedinsurance");

	public Vehiclepage(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_veichle() {
		Select make = new Select(driver.findElement(By.id("make")));
		make.selectByVisibleText("BMW");
		driver.findElement(model).sendKeys("Scooter");
		driver.findElement(cylinder).sendKeys("43");
		driver.findElement(performace).sendKeys("554");
		driver.findElement(date).sendKeys("10/15/2021");
		Select state = new Select(driver.findElement(By.id("numberofseats")));
		state.selectByVisibleText("8");
		driver.findElement(hand_drive).click();
		driver.findElement(seats).sendKeys("3");
		driver.findElement(fuel).sendKeys("Petrol");
		driver.findElement(payload).sendKeys("15");
		driver.findElement(weight).sendKeys("899");
		driver.findElement(price).sendKeys("4997");
		driver.findElement(plate).sendKeys("4535345345");
		driver.findElement(mileage).sendKeys("3432");
		driver.findElement(btn_next).click();
	}
}