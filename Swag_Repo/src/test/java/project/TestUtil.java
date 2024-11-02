package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtil {
	
	public static WebDriver setupDriver() {
		WebDriver driver=new ChromeDriver();
    	System.setProperty(Config.driverName, Config.driverPath);       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(Config.BASE_URL);
        return driver;
    }

}
