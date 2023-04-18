package week2.day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
        //To Open Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("revathipriya12@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement Name=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"));
		
		String FirstName=Name.getText();
		System.out.println(FirstName);
		Name.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
        WebElement duplicatefirstname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
        String dupFirstname=duplicatefirstname.getText();
		System.out.println(dupFirstname);
		if(FirstName.equals(dupFirstname))
		{
			System.out.println("Duplicate Lead is Created");
		}
		else
		{
			System.out.println("Duplicate Lead not is Created");
		}

		
 
}
}
