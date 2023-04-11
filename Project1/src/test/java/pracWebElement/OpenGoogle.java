package pracWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
   public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver;
	   ChromeOptions co=new ChromeOptions();
	   co.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver();
	   driver.get("https://google.com/");
	   WebElement txtbox=driver.findElement(By.name("q"));
	   txtbox.sendKeys("java"+Keys.ENTER);
	   }
}
