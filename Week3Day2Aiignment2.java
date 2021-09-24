package Week3Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week3Day2Aiignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(" https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();	
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		List<WebElement> prolist = driver.findElements(By.xpath("//div[@class='contentHolder']"));
		System.out.println("Total number of product listed product=="+prolist.size());
		List<WebElement> brandlist= driver.findElements(By.xpath("//div[@class='brand']"));
		List<WebElement> namelist= driver.findElements(By.xpath("//div[@class='name']"));
		
		for (int i = 0; i < prolist.size(); i++) {
			System.out.println(brandlist.text );
		}

		}

}
