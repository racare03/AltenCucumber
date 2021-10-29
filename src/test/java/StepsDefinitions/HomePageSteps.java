package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.EmpleoPage;
import pages.HomePage;
import pages.NoticiasPage;

public class HomePageSteps {
	
	WebDriver driver;
	String PATH_DRIVER = "./drivers/chromedriver.exe";
	String TYPE_DRIVER = "webdriver.chrome.driver";
	String URL = "https://www.alten.es/";
	
	HomePage home;
	EmpleoPage empleo;
	NoticiasPage noticias;
	
	@Before
	public void setUp() {
		System.setProperty(TYPE_DRIVER, PATH_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		home = new HomePage(driver);
				
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("I accept the cookies")
	public void i_accept_the_cookies() {
		home.aceptarCookies();
		
	}
	
	@And("I navigate to Empleo")
	public void i_navigate_to_empleo() {
		home.clicarEmpleo();
		
	}

	@And("^I text (.*) in the search text box$")
	public void i_text_job__in_the_search_text_box(String puesto) {
		home.escribirEmpleo(puesto);
	}

	@And("I select a profile")
	public void i_select_a_profile() {
		home.seleccionarProfile();

	}

	@When("I select a city")
	public void i_select_a_city() {
		home.seleccionarCiudad();
	}

	@Then("the offers Jobs are displayed")
	public void the_offers_jobs_are_displayed() {
		empleo = new EmpleoPage(driver);
		Assert.assertEquals("EMPLEO", empleo.getTextoEmpleo());
	}
	
	@And("I navigate to News")
	public void i_navigate_to_news() {
		home.clicarNews();
	}

	@Then("the News page is displayed")
	public void the_news_page_is_displayed() {
		noticias = new NoticiasPage(driver);
		Assert.assertEquals("NEWS", noticias.getTextoNoticias());
	}


}
