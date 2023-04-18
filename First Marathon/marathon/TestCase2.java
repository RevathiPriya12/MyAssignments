package first.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
        //To Open Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//input[text()='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("DASARA");		//driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).
		

		
	
		
		
}
}

