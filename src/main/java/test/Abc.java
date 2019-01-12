package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Abc {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharmilaghantasala\\Downloads\\Selenium-Server-Standalone\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://shop.learnmos.com/");
   driver.manage().window().maximize();
   WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));

   Actions ac =new Actions(driver);
   ac.moveToElement(element).perform();
   
   driver.findElement(By.linkText("Elearning")).click();
   driver.findElement(By.xpath("//*[@id='product-wrapper']/ol/li[3]/div[1]/a")).click();
 
  //driver.findElement(By.xpath("//button[@id="product-addtocart-button"]")).click();
 // driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
// driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
   driver.findElement(By.xpath(".//*[@id='product-wrapper']/ol/li[3]/div[2]/h5/a")).click();
 WebElement we= driver.findElement(By.cssSelector("#select_48"));
Select sc=new Select(we);
 sc.selectByVisibleText("No subscription");
 driver.findElement(By.xpath("//*[@id='product-addtocart-button']")).click();
 //driver.findElement(By.xpath("//button[@class='btn btn-xs btn-default']")).click();
// driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr[2]/td/div/a[2]/span")).click();
 driver.findElement(By.xpath("//button[@class='btn btn-xs btn-default']")).click();


	
	
	
	
	
	
	


}
