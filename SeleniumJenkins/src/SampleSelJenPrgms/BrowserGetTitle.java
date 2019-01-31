package SampleSelJenPrgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserGetTitle {
	WebDriver driver;

	@BeforeTest
	public void Initial() {

		System.out.println("Welcome to Jenkins");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Probe7\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void f() {

		driver.get("https://test3.icoreemr.com/interface");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("username")).sendKeys("imedicor");
		driver.findElement(By.name("password")).sendKeys("Y9F!jk@bpPhJ4s");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div[3]/div/input")).click();
		System.out.println(driver.getTitle());
			
	}

	@AfterTest
	public void last() {
		System.out.println("Adding Patient from Rapid Entry");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mast_add_patient"))).click();
	}
}
