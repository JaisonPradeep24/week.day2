package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// To load the url in chrome browser
		driver.get("https://en-gb.facebook.com/");
		
		// To maximize the screen
		driver.manage().window().maximize();
		
		// Adding Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		System.out.println("Clicking on the New Account button");
		
		// Step 7: Enter the first name
		System.out.println("Adding the user details of name");
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Jaison");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Pradeep Kumar");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("098765432");
		
		// Step 10: Enter the password
		System.out.println("Entering the password");
		driver.findElement(By.id("password_step_input")).sendKeys("HelloWorld");
		

		// Step 11: Handle all the three drop downs
		System.out.println("Handling the DOB");
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("24");

		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Oct");

		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1990");
		
		// Step 12: Select the radio button "Male"
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
