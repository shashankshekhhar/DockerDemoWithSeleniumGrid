package dockers;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SetupDockerGrid {

	@BeforeTest
	public void startGrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start StartGrid.bat");
		
		Thread.sleep(30000);
	}
	
	@AfterTest
	public void stopGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start StopGrid.bat");
		Thread.sleep(30000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
	}
}
