package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestCase {

	private static WebElement crmsfaLink;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title =	driver.getTitle();
		System.out.println("title:"+title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
		String title1 = driver.getTitle();
		System.out.println("Title1:"+title1);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priyanka");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Priyanka TestLeaf");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4 lakhs");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandru");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Chandru");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/08/95");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("32");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("24");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyanka.chandru94@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840874792");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Chandru");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Chandruprint@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Priyanka");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("12/1a lawsar street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Ekkatuthangal");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Priyanka");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600032");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println("title2:"+title2);
		
		
		
	}
	
			
		
		
		

	}
