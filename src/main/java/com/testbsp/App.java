package com.testbsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//Browser initialization
    			System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");
    			ChromeOptions chromeOptions = new ChromeOptions();
    			chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("disable-gpu");
    			WebDriver driver = new ChromeDriver(chromeOptions);
    			
    			driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
    	 //open App
    			driver.get("https://github.com/");
    			System.out.println(driver.getTitle());
    			
    	//Close Browser       
    			driver.quit();
    }
}
