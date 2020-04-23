package docker.Testing;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerTests {

	public static void main(String[] args) throws MalformedURLException {

		//DesiredCapabilities dc = new DesiredCapabilities().chrome();
		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		URL url = new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(url, dc);

		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.quit();

	}
}
