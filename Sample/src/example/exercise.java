package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	
			
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("perfume");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")).click();	
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("vedprakashh800@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();	
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Ved@1234");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/s?k=perfume&crid=2Z81E6E0D5CDM&sprefix=%2Caps%2C830&ref=nb_sb_ss_recent_1_0_recent");
		driver.findElement(By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"p_90/20912642031\"]/span/a/div/label/i")).click();
		
		driver.quit();
	

	}

}
