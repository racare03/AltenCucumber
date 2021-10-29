package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoticiasPage {
	
	WebDriver driver;
	
	By textoNoticias = By.xpath("//h1[text()='NEWS']");
	
	public NoticiasPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTextoNoticias() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.textToBe(textoNoticias,"NEWS"));
		return driver.findElement(textoNoticias).getText();
	}

}
