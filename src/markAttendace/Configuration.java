package markAttendace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {
	public static WebDriver selectDriver() {
		System.setProperty("webdriver.chrome.driver","D:\\sw\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://live2.empxtrack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		return driver;
	}
	
	

}
