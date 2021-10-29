package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmpleoPage {
	
	WebDriver driver;
	
	By textoEmpleo = By.xpath("//h1[text()='Empleo']");
	
	public EmpleoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTextoEmpleo() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.textToBe(textoEmpleo,"EMPLEO"));
		return driver.findElement(textoEmpleo).getText();
	}

}
