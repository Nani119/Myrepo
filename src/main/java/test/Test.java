package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) {
	    WebDriver  driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", "D:\\pavan\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).moveToElement(driver.findElement(By.linkText("Elearning"))).click().build().perform();
	

	}

}
