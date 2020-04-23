package dockers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FireFoxTest {

	
	RemoteWebDriver driver;

	@Test
	public void test1() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		URL url = new URL("http://localhost:4444/wd/hub");

		driver = new RemoteWebDriver(url, dc);
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());

		driver.quit();
	}
	
}
