package com.Task1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Flipkart {
	public static WebDriver driver;
	
	
	@BeforeSuite
	private void SetProperty() {
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\husse\\eclipse-workspace\\Selenim concepts\\Driver\\chromedriver.exe");
driver= new ChromeDriver();
	}
	
	@BeforeClass
	private void Login() {

driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*@BeforeMethod
private void LoginDet() {
driver.findElement(By.xpath("//a[@class='_1TOQfO']/span[text()='Login']")).click();
WebElement email = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/parent::label[@class='Gq-80a']"));
email.click();
email.sendKeys("8637615641");
	}	*/
	
@Test
private void Electronics() {
driver.findElement(By.name("q")).sendKeys("mixer griner" + Keys.ENTER);

WebElement mixer = driver.findElement(By.xpath("//div[text()='₹1,599']//parent::div/parent::div/parent::div/parent::div/div/div[text()='Longway Super Dlx 700 W Mixer Grinder, (3 Jars)  & Kwid 1100 W Dry Iron']"));

System.out.println(mixer.getText());
mixer.click();

Set<String> WH = driver.getWindowHandles();
for(String str : WH) {
	driver.switchTo().window(str);
}
 WebElement add = driver.findElement(By.xpath("//button[text()='Add to cart']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();", add);
add.click();
driver.findElement(By.xpath("//span[text()='Place Order']")).click();
driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("husseyhari@gmail.com");

}}




