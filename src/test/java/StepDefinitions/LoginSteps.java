package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginSteps {
	 
	  
	  
	  
	WebDriver driver = null;
	
	
	
	  

	@Given("^login sayfasina gidilir$")
	public void login_sayfasina_gidilir() {
		System.out.println("Bu adımda-login sayfasina gidildiği görüldü");
		System.setProperty("webdriver.chrome.driver","C:/Users/Furkan USLU/eclipse-workspace/CucumberJava/CucumberJava/src/test/resources/drivers/chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.enuygun.com/?gclid=CjwKCAjw77WVBhBuEiwAJ-YoJAvQRtnk6TzcTUWiwQsBK_TxwcYFN7mWC1iY72CFh2rDgGA096VMNRoCBQgQAvD_BwE");
		driver.findElement(By.xpath("//a[text()='Giriş Yap']")).click();
			
	}


	@When("^email ve sifre yazilir$")
	public void email_ve_sifre_yazilir() throws InterruptedException {
		System.out.println("Bu adımda-email ve şifrenin girildiği görüldü");
		Thread.sleep(110);
		driver.switchTo().activeElement();
		
		WebElement mail = driver.findElement(By.name("_email"));
        mail.sendKeys("furkanuslu777@gmail.com");
        
        
      
  	   driver.findElement(RelativeLocator.with(By.tagName("input")).below(mail )).sendKeys("20012010fF."); 
	}
	    		  
	@And("^login butonununa tiklanir$")
	public void login_butonununa_tiklanir() throws InterruptedException {
		System.out.println("Bu adımda-Login butonuna tıklandığı görüldü");
		
		WebElement LoginButton = driver.findElement(By.xpath("//span[text()='Giriş Yap']"));
		LoginButton.click();
		
		Thread.sleep(10000);
		
        
	}

	@Then("^giris yaptigi gorulur$")
	public void giris_yaptigi_gorulur() {
		System.out.println("Bu adımda-Giriş yapılıp oturumun açıldığı görüldü");
		
		driver.findElement(By.xpath("//span[contains(text(),'furkanuslu777')]")).click();
		
		driver.close();
		driver.quit();
	}


}
