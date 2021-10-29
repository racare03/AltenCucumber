package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	By cookies = By.id("tarteaucitronPersonalize2");
	By empleo = By.xpath("(//a[text()='Empleo'])[1]");
	By texto_empleo = By.name("text");
	By perfiles = By.xpath("//a[text()='Todos los perfiles']");
	By puesto_interno = By.xpath("//a[text()='Puestos internos']");
	By ciudades = By.xpath("//a[text()='Todas las ciudades']");
	By madrid = By.xpath("//a[text()='Madrid']");
	By news = By.xpath("//a[text()='Noticias']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void aceptarCookies() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cookies));
		driver.findElement(cookies).click();
	}
	
	public void clicarEmpleo() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(empleo));
		driver.findElement(empleo).click();
	}
	
	public void escribirEmpleo(String puesto) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(texto_empleo));
		driver.findElement(texto_empleo).sendKeys(puesto);
		
	}
	
	public void seleccionarProfile() {		
		driver.findElement(perfiles).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(puesto_interno));
		driver.findElement(puesto_interno).click();
	}
	
	public void seleccionarCiudad() {		
		driver.findElement(ciudades).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(madrid));
		driver.findElement(madrid).click();
	}
	
	public void clicarNews() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(news));
		driver.findElement(news).click();
	}
	
	

}
