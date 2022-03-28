package org.base;

import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BaseClass {
	
	public static WebDriver driver;
	
	public static Actions a;
	
	public static Robot r;
	
	public static Alert a1;
	
	private static void toLaunchBrowser() {
		
		System.setProperty("WebDriver.chrome.driver","C:\Users\DELL\eclipse-workspace\BaseClass\Folder\chromedriver.exe");
		
		Webdriver driver = new chromeDriver();
	}
	private static void toPassUrl(String url) {
		
		driver.get(url);
	}
	private static void toMaximize() {
		
		driver.manage().window().maximize();
	}
	private static void toInput(WebElement element, String keys) {
		
		element.sendKeys(keys);
	}
	private static void toClick(WebElement element) {
		
		element.click();
	}
	private static void toDoMousehoverAction(WebElement element) {
		
		a= new Actions(driver);
		
		a.moveToElement(element).perform();
		}
	
	private static void toDoubleClick(WebElement element) {
		
		a.doubleClick(element).perform();
		
	}
	
	private static void toContextClick(WebElement element) {
		
		a.contextClick(element).perform();
	}
	
	private static void toDoKeyUp(WebElement element,CharSequence key) {

		a.keyUp(key);
	}
	
	private static void toDokeyDown(WebElement element,CharSequence key) {
		
		a.keyDown(key);
	}
	
	private static void toDoKeyPress(int keycode) {
		
		r = new Robot();
		
		r.keyPress(keycode);
		
	}
	private static void toDoKeyRelease(int keycode) {
		
		r.keyRelease(keycode);
	}
	
	private static void toGetTitle() {
		
		System.out.println(driver.getTitle());
	}
	
	private static void toGetCurrentUrl() {
		
		System.out.println(driver.getCurrentUrl());
	
	}
	private static void toClose() {
		
		driver.close();
	}
	
	private static void toQuit() {
		
		driver.quit();
	}
	
	public static void toAccept() {
		
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();
	}
	private static void toDismiss() {
		
		a1.dismiss();
	}
	
	private void toSendKeys() {
		
		a1.sendKeys();
		

	}
	
	
	
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
}
