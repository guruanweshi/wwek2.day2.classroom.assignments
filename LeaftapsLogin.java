package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com./opentaps/control/main");
		
	    WebElement userNameElement = driver.findElement(By.id("username"));  //Find element
	    userNameElement.sendKeys("Demosalesmanager");
	    
		WebElement passwordfElement = driver.findElement(By.name("PASSWORD"));
		passwordfElement.sendKeys("crmsfa");
		
		WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
		loginElement.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		leadsElement.click();
		
		WebElement createLeads = driver.findElement(By.linkText("Create Lead"));
		createLeads.click();
		
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("MI5");
		
		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameElement.sendKeys("James");
		
		WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameElement.sendKeys("Bond");
		
		WebElement submitElement = driver.findElement(By.name("submitButton"));
		submitElement.click();
	}

}
