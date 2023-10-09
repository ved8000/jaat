package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=perfume&crid=VOL1XW83TWSW&sprefix=perfume%2Caps%2C1162&ref=nb_sb_noss_1");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		
	}

}








