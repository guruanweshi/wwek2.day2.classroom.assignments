package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

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
		firstNameElement.sendKeys("Tony");
		
		WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameElement.sendKeys("Stark");
		
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		sourceElement.sendKeys("Employee");
		
		WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		WebElement ownershipElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		WebElement currencyElement = driver.findElement(By.id("createLeadForm_currencyUomId"));
		
		// Select class
		Select dd1= new Select(industryElement);
		dd1.selectByIndex(1);
		
		Select dd2= new Select(ownershipElement);
		dd2.selectByVisibleText("Partnership");
		
		Select dd3= new Select(currencyElement);
		dd3.selectByValue("USD");
		
		WebElement submitElement = driver.findElement(By.name("submitButton"));
		submitElement.click();
		
		
		

	}

}
