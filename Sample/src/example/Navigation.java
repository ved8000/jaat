package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is= " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		Thread.sleep(2000);
		

		String urlToNavigate = "https://www.amazon.in/s?hidden-keywords=B0BQN2RMJF+%7C+B0CBTXDVFX+%7C+B09NR6G588+%7C+B0B31CBSXQ+%7C+B08CPLTK9B+%7C+B0BBGJPX7X+%7C+B0CC2DP26M+%7C+B0BSFW9R3C+%7C+B09NR7Z144+%7C+B0BVQV1G5P+%7C+B0B1F6GQPS+%7C+B095KXJFQ7+%7C+B08CFCK6CW+%7C+B0BLHP3922+%7C+B0BJ7D4TDR+%7C+B09WJ6ZR75+%7C+B0BLHKBFLK+%7C+B0BL3JQ5X3+%7C+B08D11DZ2W+%7C+B095MC5LGL+%7C+B0B31FR4Y2+%7C+B0C781JFZ6+%7C+B0BXFC8BMW+%7C+B0BB728SPZ+%7C+B07TFW1KML+%7C+B08CFCD3CW+%7C+B0BL3FLQK5+%7C+B07TCN5VR9+%7C+B07MK2H78S+%7C+B09WJ7R8BP+%7C+B09ND94ZRG+%7C+B08CZYD5KX+%7C+B088YKSNTX&_encoding=UTF8&content-id=amzn1.sym.b936cebd-b81a-4fee-a150-8f1d61f36638&pd_rd_r=fb616637-1763-4f1d-9913-ee108c0f529f&pd_rd_w=r08W7&pd_rd_wg=ZWZxd&pf_rd_p=b936cebd-b81a-4fee-a150-8f1d61f36638&pf_rd_r=8SQ4X0P1E8TEMWTM0EFJ&ref=pd_gw_unk";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigating To Product");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		System.out.println("Title of the page is= " + title);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
