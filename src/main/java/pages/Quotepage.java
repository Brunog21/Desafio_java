package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Quotepage {
	WebDriver driver;
	
	By email = By.id("email");
	By phone = By.id("phone");
	By usern = By.id("username");
	By pass = By.id("password");
	By confirm_pass = By.id("confirmpassword");
	By coment = By.id("Comments");
	By btn_send = By.id("sendemail");
	
	public Quotepage(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_quote() {
		driver.findElement(email).sendKeys("Testeautomatizado@mail.com.br");
		driver.findElement(phone).sendKeys("4105550114");
		driver.findElement(usern).sendKeys("TesteAutomacao");
		driver.findElement(pass).sendKeys("Teste123");
		driver.findElement(confirm_pass).sendKeys("Teste123");
		driver.findElement(coment).sendKeys("Teste Automatizado desafio tecnico");
		driver.findElement(btn_send).click();
	}
}
