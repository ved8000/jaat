package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("phone");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
		driver.quit();
	}

}
