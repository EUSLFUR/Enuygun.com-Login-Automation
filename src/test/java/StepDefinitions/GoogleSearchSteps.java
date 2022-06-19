package StepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearchSteps {
	WebDriver driver = null;
	
	
	

	@Given("tarayici acilir")
	public void tarayici_acilir() {
		System.out.println("Bu adımda-tarayicinin açıldığının görülür");
		System.setProperty("webdriver.chrome.driver","C:/Users/Furkan USLU/eclipse-workspace/CucumberJava/CucumberJava/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@When("kullanici google a gider")
	public void kullanici_google_a_gider() {
		System.out.println("Bu adımda-kullanici google arama sayfasinda");
		driver.navigate().to("https://www.google.com.tr/?hl=tr");
	}
		
		
	@When("kullanici arama kutusuna enuygun metnini girer")
	public void kullanici_arama_kutusuna_bir_metin_girer1() {
		System.out.println("Bu adımda-kullanici google arama sayfasinda");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("en uygun"); 
		
		     
	}

	@And("entera tiklar")
	public void entera_tiklar() {
		System.out.println("Bu adımda-entera tıklanır");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(Keys.ENTER); 
		
	}
	
	@Then("kullanici arama sonuclarinda enuygun.com tiklar")
	public void kullanici_arama_sonuclarina_yonlendirilir() {
		System.out.println("Bu adımda-kullanici arama sonuclarina yonlendirildiği görülür");
		driver.findElement(By.xpath("//cite[text()='https://www.enuygun.com']")).click();
		
		driver.close();
		driver.quit();
	}
	}


}
