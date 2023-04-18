package com.tests.Git_Project_For_FaceBook_Login_Functionality;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	
	//Secure shell cryptography
	public class LoginTest {
		
	public static WebDriver driver;
		
		@BeforeTest
		public void InitialStep(){
			System.getProperty("webdriver.edge.driver","D:\\Selenium_Drivers\\msedgedriver.exe");	
			driver=new ChromeDriver();
			System.out.println("Launching Browser");
			
			}
		
		@Test
		public void doLogin(){
			System.out.println("Executing Login Test");
			driver.get("https://en-gb.facebook.com/");
			
			//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			System.out.println("Entering Username");
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("nehaalaspure@gmail.com");
			
			System.out.println("Entering password");
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("neha123");
			
			System.out.println("Clicking on LogIn Button");
			driver.findElement(By.name("login")).click();
			
			System.out.println("Loginning into facebook account");
			}
		
		@AfterTest
		public void CloseBrowser(){
		if (driver!=null)
			driver.close();
		}
		

	}



