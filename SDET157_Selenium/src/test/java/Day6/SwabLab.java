package Day6;


import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwabLab {	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	WebElement username= driver.findElement(By.xpath("//input[@name='user-name']"));
	WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
	WebElement login = driver.findElement(By.xpath("//input[@name='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		WebElement SauselabBackpack =driver.findElement(By.xpath("//a/div[contains(text(),\"Sauce Labs Backpack\")]"));
		SauselabBackpack.click();
		WebElement AddtoCart = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
		AddtoCart.click();
		
		WebElement viewCart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
		viewCart.click();
		
		WebElement Checkout_btn= driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']"));
		Checkout_btn.click();
		WebElement Checkout_title= driver.findElement(By.xpath("//span[@class='title']"));
		WebElement FirstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    WebElement LastName =driver.findElement(By.xpath("//input[@placeholder= 'Last Name']"));
	    WebElement ZipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
	    WebElement Continue_btn= driver.findElement(By.xpath("//input[@type='submit']"));
	    
	    	FirstName.sendKeys("Tom");
	    	LastName.sendKeys("Mathew");
	    	ZipCode.sendKeys("72712");
	    	Continue_btn.click();
	   WebElement Checkout_Summary= driver.findElement(By.xpath("//span[@class='title']"));
	   String Checkout=Checkout_Summary.getText();
	   System.out.println(Checkout);
	   WebElement Finish_Btn= driver.findElement(By.xpath("//button[@id='finish']"));
	   Finish_Btn.click();
	   
	   
		//driver.quit();
	
	}

}
