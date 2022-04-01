package Maven.Testng_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_ClassPr {

	public static WebDriver driver;

	public static WebDriver brWser() {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void uRl(String url) {
		driver.get(url);

	}

	public static void maX() {
		driver.manage().window().maximize();

	}

	public static void currentURL() {
		driver.getCurrentUrl();

	}

	public static void bacKward() {
		driver.navigate().back();

	}

	public static void forWard() {
		driver.navigate().forward();

	}

	public static void naVigate(String url) {
		driver.navigate().to(url);

	}

	public static void reFresh() {
		driver.navigate().refresh();

	}

	public static void quiT() {
		driver.quit();

	}

	public static void cloSe() {
		driver.close();
	
	}
	
	
	public static void sendValues(WebElement element, String values) {
		element.sendKeys(values);

	}

	public static void clicKelement(WebElement element) {
		element.click();

	}
	
	public static void clr(WebElement element) {
		element.clear();

	}

	public static void moveToElement(WebElement a) {
		Actions y = new Actions(driver);
		y.moveToElement(a).perform();
	}

	public static void moveToElement1(WebElement a, WebElement b) {
		Actions z = new Actions(driver);
		z.moveToElement(a).build().perform();
		z.moveToElement(b).build().perform();

	}

	public static void pageDown() {
		JavascriptExecutor ab = (JavascriptExecutor) driver;
		ab.executeScript("window.scrollBy(0,300)");

	}

	public static void pageUp() {
		JavascriptExecutor cd = (JavascriptExecutor) driver;
		cd.executeScript("window.scrollBy(0,-300)");

	}

	// This is String Method
	public static void acTions(String m) throws AWTException {
		Actions s = new Actions(driver);
		s.contextClick(driver.findElement(By.xpath(m))).perform();

		// This is WebElement Method(WebElement m)
		// s.contextClick().perform();
	}

	public static void roBot() throws AWTException {
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void screenShot(String s) throws IOException {
		TakesScreenshot ab = (TakesScreenshot) driver;
		File srcfile = ab.getScreenshotAs(OutputType.FILE);
		File desfile = new File(s);
		FileUtils.copyFile(srcfile, desfile);
	}

//********************************ALERTS*********************************
	public static void simpleAlert(WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
		;

	}

	public static void confirmAlert(WebElement element, String ok, String cancel) {
		element.click();
		if (ok.equalsIgnoreCase("ok")) {

			driver.switchTo().alert().accept();
		} else if (cancel.equalsIgnoreCase("cancel")) {

			driver.switchTo().alert().dismiss();
			;
		}

	}

	public static void promptAlert(WebElement element, String value, String ok) {
		element.click();
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
		}

	}

//**********************************WINDOW_HANDLES******************************************
	public static void windowHandles(int num) {
		Set<String> ab = driver.getWindowHandles();
		ArrayList<String> c = new ArrayList<>(ab);
		driver.switchTo().window(c.get(num));

	}

//**********************************Selection******************************************
	public static void seLection(WebElement element, String option, String value) {

		Select ab = new Select(element);
		if (option.equalsIgnoreCase("byindex")) {

			int parseInt = Integer.parseInt(value);
			ab.selectByIndex(parseInt);
		} else if (option.equalsIgnoreCase("byValue")) {
			ab.selectByValue(value);
		} else if (option.equalsIgnoreCase("")) {
			ab.selectByVisibleText(value);
		} else {
			System.out.println("INVALID");
		}
	}

//**********************************Frames******************************************
	public static void singleFrame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void defContent() {
		driver.switchTo().defaultContent();

	}

	public static void multiFrame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void threadsl() throws InterruptedException {
		Thread.sleep(3000);

	}

}
