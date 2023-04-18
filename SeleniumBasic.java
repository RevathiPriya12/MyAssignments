package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
	public static void main(String[] args) {
		//To Open ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To Maximize the Browser Opened
		driver.manage().window().maximize();
		//To get the Title of the Page 
		String title=driver.getTitle();
		System.out.println(title);
		//To get the URl of the browser
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("CRM/SFA is clicked");
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Leads is clicked");

		
		
		
		//To close the window
		driver.close();
	}

}



