package Day6;

import java.util.List;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TutorialsNinja {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php");
		// Selecting the currency
		
		WebElement currency= driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
		//List<WebElement> mylist = currency.findElements(null);
		
		// Selecting the Camera
		WebElement camera = driver.findElement(By.linkText("Cameras"));
		camera.click();
		WebElement Cam_select=driver.findElement(By.linkText("Canon EOS 5D"));
		Cam_select.click();
		
		// Add to cart
		
		WebElement SelectOption= driver.findElement(By.xpath("//*[@id='input-option226']"));
		SelectOption.click();
		
		WebElement AddtoCart= driver.findElement(By.xpath("//button[@id='button-cart']"));
		AddtoCart.click();
		/*
		 * WebElement errormessage =
		 * driver.findElement(By.xpath("//*[@id=\"product\"]/div[1]/div")); String
		 * errorvalue = errormessage.getText(); System.out.println("Error message is : "
		 * + errorvalue)
		 */;

// BacktoHome
        
        WebElement Homepage=driver.findElement(By.xpath("//*[@class='fa fa-home']"));
        Homepage.click();
       // Searching Iphone
        
        WebElement phones = driver.findElement(By.linkText("Phones & PDAs"));
        phones.click();
        WebElement iphone = driver.findElement(By.linkText("iPhone"));
        iphone.click();
	
		WebElement Quantity= driver.findElement(By.xpath("//input[@name='quantity']"));
		
		Quantity.click();
		Quantity.clear();
		Quantity.sendKeys("2");
		WebElement iphone_addtocart = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
		   iphone_addtocart.click();
		   Thread.sleep(5000);
		   WebElement success_msg= driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
		   String Msg= success_msg.getText();
		   System.out.println(Msg);
		   WebElement cart = driver.findElement(By.xpath("//*[@id='cart-total']"));
		   cart.click();
		   
		  WebElement viewcart= driver.findElement(By.linkText("View Cart"));
		   viewcart.click();
		  // WebElement viewcart= driver.findElement(By.xpath("//*[@class='fa fa-shopping-cart']"));
		WebElement   updateQuantity=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
		
		updateQuantity.click();
		  Thread.sleep(5000);
	       updateQuantity.clear();
	      
	       updateQuantity.sendKeys("3");
	       Thread.sleep(3000);
	      WebElement updatebtn=driver.findElement(By.xpath("//*[@class='fa fa-refresh']"));
	      updatebtn.click();

	      WebElement ecotax = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[2]/td[1]/strong"));
         String tax= ecotax.getText();
         System.out.println(tax);
	      WebElement vat = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[3]/td[1]/strong"));
	      String valuetax= vat.getText();
	      System.out.println(valuetax);
	      WebElement Checkout= driver.findElement(By.linkText("Checkout"));
	      WebElement Remove_btn= driver.findElement(By.xpath("//*[@class='fa fa-times-circle']"));
	      // Print the error Message 
	      WebElement error_Msg= driver.findElement(By.xpath("//*[@class='fa fa-check-circle']"));
	      Remove_btn.click();
	      Thread.sleep(2000);
	      WebElement backtohome1=driver.findElement(By.xpath("//*[@class='fa fa-home']"));
	        backtohome1.click();
	        // Selection of Mac Book
	        WebElement Desktops= driver.findElement(By.linkText("Desktops"));
	       Desktops.click();
	       
	      
	       WebElement LaptopsMac= driver.findElement(By.linkText("Laptops & Notebooks"));
	       LaptopsMac.click();
	       WebElement Showall=driver.findElement(By.linkText("Show AllLaptops & Notebooks"));
	       Showall.click();
	       WebElement Macbook= driver.findElement(By.linkText("MacBook"));
	       Macbook.click();
	       Thread.sleep(3000);
	       WebElement Mac_AddtoCart =driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block']"));
		       Mac_AddtoCart.click();
		    
		       Thread.sleep(3000);
		       WebElement Shoppingcart = driver.findElement(By.partialLinkText("shopping"));
		       Shoppingcart.click();
		       // Adding Coupon code 
		       
		       WebElement Couponcode = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a"));
		       Couponcode.click();
		       Thread.sleep(2000);
		       WebElement EnterCouponhere = driver.findElement(By.xpath("//input[@id='input-coupon']"));
		       EnterCouponhere.sendKeys("ABCD123");
		       WebElement ApplyCoupon= driver.findElement(By.xpath("//input[@id='button-coupon']"));
		       ApplyCoupon.click();
		       Thread.sleep(4000);
		       WebElement ErrorMsg= driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
		    		   String PrintMsg= ErrorMsg.getText();
		    		   System.out.println(PrintMsg);
		    		   
		    		   // Adding Gift Certificate
		    		   WebElement giftCert = driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']"));
		    			giftCert.click();
		    	
		    	Thread.sleep(5000);
		    	WebElement gift= driver.findElement(By.xpath("//input[@placeholder='Enter your gift certificate code here']"));
		    	
		    	gift.sendKeys("AXDFGH123");

		    	Thread.sleep(5000);
		    	WebElement Applygift= driver.findElement(By.xpath("//*[@id=\"button-voucher\"]"));
		    	Applygift.click();
		    	Thread.sleep(3000);
		    	WebElement PrintMsg1 = driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
		    	String GiftMsg=PrintMsg1.getText();
		    	System.out.println(GiftMsg);
		        
		    	
		    	//Clear both textbox values and proceed to checkout
		    	
		    	 
		    	gift.clear();
		    	Couponcode.click();
		    	Thread.sleep(2000);
		    	EnterCouponhere.click();
		    	Thread.sleep(2000);
		    	EnterCouponhere.clear();
		    	
		        // Homepage.click();
		    	WebElement Mp3player= driver.findElement(By.linkText("MP3 Players"));
		    	Mp3player.click();
		    	WebElement showall =driver.findElement(By.linkText("Show AllMP3 Players"));
		    	showall.click();
		    	WebElement Ipodnano= driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img"));
		    	Ipodnano.click();
		    	WebElement Addtocart=driver.findElement(By.xpath("//button[@id='button-cart']"));
		    	Addtocart.click();
		    	Thread.sleep(2000);
		    	// CheckoutButton
		    	WebElement CheckoutBtn= driver.findElement(By.linkText("Checkout"));
		    	CheckoutBtn.click();
		    	// My accounnt Information
		    	
		    	WebElement Myaccount= driver.findElement(By.xpath("//a[@title='My Account']"));
		    	Myaccount.click();
		    	WebElement registerbtn= driver.findElement(By.linkText("Register"));
		    	registerbtn.click();
		    			
		    	// Account Information/ Select register account option and enter all account and billing details, click continue
		    	WebElement firstName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
				firstName.sendKeys("Fname");
				WebElement lastName = driver.findElement(By.xpath("//input[@id='input-lastname']"));
				lastName.sendKeys("Lname");
				WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
				email.sendKeys("bonnie@gmail.com");
				WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
				telephone.sendKeys("3456789021");
				WebElement pwd = driver.findElement(By.xpath("//input[@id='input-password']"));
				pwd.sendKeys("Pass@123");
				WebElement cnpwd = driver.findElement(By.xpath("//input[@id='input-confirm']"));
				cnpwd.sendKeys("Pass@123");
				WebElement chck = driver.findElement(By.xpath("//input[@name='agree']"));
				chck.click();
				WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
				continueBtn.click();
				Thread.sleep(2000);
				continueBtn = driver.findElement(By.xpath("//a[text()='Continue']"));
			
				continueBtn.click();
				//Add comments, click continue and check the error message related to payment method
				
				
				
				//Test case 16
				WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact Us']"));
				contactUsLink.click();
				WebElement name = driver.findElement(By.xpath("//input[@id='input-name']"));
				name.sendKeys("testing");
				WebElement enquiry = driver.findElement(By.xpath("//textarea[@id='input-enquiry']"));
				enquiry.sendKeys("What is the current location?");
				WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Submit']"));
				submitBtn.click();
				continueBtn=driver.findElement(By.xpath("//a[text()='Continue']"));
				continueBtn.click();
			
				
				
		    	 
	}   	 
	}