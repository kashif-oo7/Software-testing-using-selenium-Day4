package classexerciseday4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
   public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver;
	   ChromeOptions co=new ChromeOptions();
	   co.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver();
	   driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	   WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
	   rname.sendKeys("thomas");
	   WebElement remail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
	   remail.sendKeys("thomas@gmail.com");
	   WebElement name=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
	   name.sendKeys("harry");
	   WebElement email=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
	   email.sendKeys("@gmail.com");
	   WebElement click=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
	   click.click();
	   WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
	   message.sendKeys("HAPPY BIRTHDAY");
	   WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
	   amount.sendKeys("10");
	   WebElement con = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
		 con.submit();
   }
   }
