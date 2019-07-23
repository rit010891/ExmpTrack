package markAttendace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	public static void performLogIn()
	{
		 WebDriver driver=Configuration.selectDriver();
		 driver.findElement(By.cssSelector("input#usr_1")).sendKeys("MSTPL386");
		 driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rit010891");
		 driver.findElement(By.cssSelector("input#location")).sendKeys("Moolya");
		 driver.findElement(By.cssSelector("input[value='Login']")).click();
		 driver.quit();
	}

}
