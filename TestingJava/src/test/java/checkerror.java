import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajul\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	
		
	}

}
