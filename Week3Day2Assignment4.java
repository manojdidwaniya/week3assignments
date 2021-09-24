package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week3Day2Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // download the chrome driver in local machine and setup path
		ChromeDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // meximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("brc",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("pune",Keys.ENTER);
		driver.findElement(By.id("buttonFromTo")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
		Set<String> st= new HashSet<String>();
		for (int i = 0; i <findElements.size(); i++) {
			String text = findElements.get(i).getText();
			st.add(text);
			
		}
		System.out.println(st.size());
		
	}

}
