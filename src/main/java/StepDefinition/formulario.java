package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Insurantpage;
import pages.Pricepage;
import pages.Vehiclepage;
import pages.Productpage;
import pages.Quotepage;

public class formulario {
	String expectedTitle = "undefined Insurance";
	RemoteWebDriver driver;

	@Given("que esteja na home do site")
	public void que_esteja_na_home_do_site() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().setSize(new Dimension(1761, 998));

		WebElement confirmation = driver.findElement(By.id("selectedinsurance"));
		String confirmacao = confirmation.getText();

		if (confirmacao.contains("undefined Insurance")) {
			System.out.println("Teste vai ocorrer Corretamente");
		} else {
			System.out.println("Teste feito apenas para undefined Insurance");
			driver.quit();
		}
	}

	@When("preencher o formulario")
	public void preencher_o_formulario() throws InterruptedException {
		Vehiclepage veichle = new Vehiclepage(driver);
		veichle.fill_veichle();
		Insurantpage insurant = new Insurantpage(driver);
		insurant.fill_insurant();
		Productpage product = new Productpage(driver);
		product.fill_product();
		Pricepage price = new Pricepage(driver);
		price.fill_price();
		Quotepage quote = new Quotepage(driver);
		quote.fill_quote();

	}

	@Then("um e-mail sera enviado")
	public void um_e_mail_sera_enviado() throws InterruptedException {
		Thread.sleep(20000);
		WebElement alert = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible"));
		String alert_text = alert.getText();
		if (alert_text.contains("Sending e-mail success!")) {
			System.out.println("Email enviado com sucesso!");
		} else {
			System.out.println("Email não enviado com sucesso!");
		}
		driver.findElement(By.className("confirm")).click();
		;
		driver.quit();
	}

}
