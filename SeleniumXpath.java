package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {
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
		
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//form[@id='login']/p/label[@for='username']"));
	
	
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//System.out.println("CRM/SFA  is Clicked");
		//driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//System.out.println("Lead is Clicked");
	    //driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    //System.out.println("Create Lead is Clicked");
	    //driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
	    //driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Revathi");
	    //driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Priya");
	    //driver.findElement(By.xpath("//input[@type='submit']")).click();
	    //driver.close();
	  
	    
	
	}

}
