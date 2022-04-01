package Maven.Testng_Automation;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testng_Prjct.Prj_Pom;

public class Demo_Site extends Base_ClassPr {
	public static Prj_Pom ty;
	
	@Test (priority = 0)
	private void Launch() {
		
		driver= Base_ClassPr.brWser();
		ty = new Prj_Pom(driver);
		driver.get("http://automationpractice.com/index.php");
		

  }
	@Test(priority = 1)
	private void login() throws InterruptedException {
		clicKelement(ty.getLgn());
		threadsl();
		sendValues(ty.getEmail(), "greeniceberg94@gmail.com");
        sendValues(ty.getPsswd(), "greenstraining2022");
        clicKelement(ty.getSign_in());
	}

	@Test(priority = 2)
	private void searchbardd() throws AWTException, InterruptedException {
		threadsl();
		sendValues(ty.getSearchbar(),"dress");
		roBot();

	}
	
	@Test(priority = 3)
	private void hme() throws InterruptedException {
		threadsl();		
		clicKelement(ty.getHme1());
		
	}	
	
	 @Test(priority = 4)
     private void searchbrbtn() throws InterruptedException {
		 threadsl();
			clr(ty.getSearchbar1());
			sendValues(ty.getSearchbar1(), "dress");
			clicKelement(ty.getSearchbutton());	 
	}
	 
	 @Test(priority = 5)
	 private void highnone() throws InterruptedException, IOException {
		//clicKelement(ty.getHighfst());
		//pageDown();
		 JavascriptExecutor ab = (JavascriptExecutor) driver;
		 ab.executeScript("window.scrollBy(0,350)");
		threadsl();
		screenShot("C:\\Users\\lenovo\\eclipse-workspace\\Testng_Automation\\Screenshots\\highnn.png");

	}

	 @Test(priority = 6)
	 private void highfst() {
		 clicKelement(ty.getHighfst());
			seLection(ty.getHighfst(), "byindex","7");

	}
	@Test (priority = 7)
	 private void addtocart() throws InterruptedException {			
		clicKelement(ty.getSlct());
        clicKelement(ty.getWshlst());
	}
	 
	@Test(priority = 8)
	private void wologin() throws InterruptedException, IOException {
		clicKelement(ty.getWolgn());
		threadsl();
	
		clr(ty.getSearchbar1());
		sendValues(ty.getSearchbar1(), "dress");
		clicKelement(ty.getSearchbutton());
        threadsl();
        
        clicKelement(ty.getSlct());
        clicKelement(ty.getWshlst());
        pageDown();
        threadsl();
        screenShot("C:\\Users\\lenovo\\eclipse-workspace\\Testng_Automation\\Screenshots\\wolg.png");
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
	
	
	
}
