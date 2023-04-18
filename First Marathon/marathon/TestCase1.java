package first.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
        //To Open Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//li[@class='sub-city'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//li[@class='sub-city'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
        driver.findElement(By.xpath("(//td[@class='wd day'])[1]")).click(); 
        driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
        WebElement NoOfBuses=driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
        String Buses=NoOfBuses.getText();
		System.out.println(Buses);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		//Thread.sleep(2000);
		WebElement Results=driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
	    String BusResults=Results.getText();
		System.out.println(BusResults);
		String title=driver.getTitle();
		System.out.println(title);
	
		
}
}
	
