package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
	        //To Open Browser
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')][1]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
			driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Rethu");
			driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("sv");
			driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("RETHU");
			driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("SV");
			driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("BCA");
			driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Bachelor Of Computer Application");
			driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("rethu12@gmail.com");
		    Select State = new Select(driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")));
		    State.selectByVisibleText("New York");
			driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
			driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Regular Days Scholar");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String title=driver.getTitle();
			System.out.println(title);
		    driver.close();
			

			
	
}
}
