package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
        //To Open Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("reva");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("CTS12345");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
        WebElement updatedname=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		
		String updatename=updatedname.getText();
		System.out.println(updatename);
		

 
}
}

