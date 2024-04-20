package Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Hello_Selenium {

	public static void main(String[] args) {
		
   WebDriver driver = new ChromeDriver();
 
   //ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.numpyninja.com/contact");
		WebElement firstName= driver.findElement(By.xpath("//input[@name='first-name']"));
		WebElement LastName= driver.findElement(By.id("input_comp-l1c0ku01"));
		WebElement Email = driver.findElement(By.id("input_comp-l1c0ku03"));
		WebElement Phone = driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement Add_Comment  = driver.findElement(By.xpath("//textarea[@id='textarea_comp-l1c0ku07']"));
		WebElement SendBtn=driver.findElement(By.xpath("//*[@id=\"comp-l1c0ku0e3\"]"));
		
		firstName.sendKeys("Remya");
		LastName.sendKeys("Prabhakaran");
		Email.sendKeys("remyap126@gmail.com");
		Phone.sendKeys("4793062797");
		Add_Comment.sendKeys("QA Selenium Course Enquiry");
		SendBtn.click();
		driver.quit();
	}
	

}
