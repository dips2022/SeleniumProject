package GridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities des = new DesiredCapabilities();
		des.setBrowserName("chrome");
		
		des.setPlatform(Platform.WINDOWS);
		
		ChromeOptions op = new ChromeOptions();
		op.merge(des);
		
		String HubURL = "http://192.168.1.5:4444/wd/hub";
		try {
			WebDriver driver = new RemoteWebDriver(new URL(HubURL), op);
			
			driver.get("http://www.google.com");
			
			System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			 
		}
	}
}
