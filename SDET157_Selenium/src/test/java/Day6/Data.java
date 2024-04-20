package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		
	}

}
