package org.utility;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver chromeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		return driver= new ChromeDriver();
		
	}
	public static WebDriver firefoxBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		return driver= new FirefoxDriver();
		
	}
	public static WebDriver edgeBrowser()
	{
		WebDriverManager.edgedriver().setup();
		return driver= new EdgeDriver();
		
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void timeOut(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	public static void sendKeys(WebElement e,String val) {
		e.sendKeys(val);
	}
	public static void click(WebElement  e) {
		e.click();
	}
	public static String currentUrl() {
		String  cUrl = driver.getCurrentUrl();
		return cUrl;	
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	private void close() {
		driver.close();
	}
	private void quit() {
		driver.quit();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static String to(String url) {
		driver.navigate().to(url);
		return url;
	}
	public static String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	public static String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public static Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	public static void alertAccept() {
	driver.switchTo().alert().accept();
	}
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static String alertprompt() {
		String text = driver.switchTo().alert().getText();
		return text;
		}
	
	public static void alertSendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
driver.manage().window().fullscreen();
	}
	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}
	
	public static Dimension getSize() {
		Dimension size = driver.manage().window().getSize();
		return size;
	}
	
	public static void setsize(Dimension d) {
		driver.manage().window().setSize(d);
	
	}
	public static void frameByIndex(int value) {
		 driver.switchTo().frame(value);
	}
	
	public static void frameByName(String value) {
		driver.switchTo().frame(value);
	}
	public static void frameByWebelement(WebElement e) {
		driver.switchTo().frame(e);
	}
	
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;
	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
		
	}
		
	public static void submit(WebElement e) {
		e.submit();
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}
	
	public static boolean isDisplayed(WebElement e) {
		boolean displayed = e.isDisplayed();
		return displayed;

	}
	public static boolean isEnabled(WebElement e) {
		boolean displayed = e.isDisplayed();
		return displayed;

	}
	public static boolean isselected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;

	}
	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();

	}
	public static void actionsClick(WebElement target) {
		Actions a = new Actions(driver);
		a.click(target).perform();	

	}
	public static void clickAndHold() {
		Actions a = new Actions(driver);
		a.clickAndHold().perform();
		
	}
	public static void clickAndHoldTarget(WebElement target) {
		Actions a = new Actions(driver);
		a.clickAndHold(target).perform();	
	}
	public static void contextClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();	
	}
	public static void contextClickTarget(WebElement target) {
		Actions a = new Actions(driver);
		a.clickAndHold(target).perform();		

	}
	public static void doubleClick() {
		Actions a = new Actions(driver);
		a.doubleClick().perform();	

	}
	public static void doubleClickTarget(WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();		
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public static void selectByIndex(WebElement e, int i) {
		Select s=new Select (e);
		s.selectByIndex(i);
	}
	public static void selectByValue(WebElement e, String value) {
		Select s=new Select (e);
		s.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement e, String value) {
		Select s=new Select (e);
		s.selectByVisibleText(value);
	}
	public static void deselectByIndex(WebElement e, int i) {
		Select s=new Select (e);
		s.deselectByIndex(i);
	}
	public static void deselectByValue(WebElement e, String value) {
		Select s=new Select (e);
		s.selectByValue(value);
	}
	public static void deselectByVisibleText(WebElement e, String value) {
		Select s=new Select (e);
		s.selectByVisibleText(value);
	}
	public static List<WebElement> getOptions(WebElement e) {
		Select s=new Select (e);
		List<WebElement> options = s.getOptions();
		return options;
	}
	public static List<WebElement> getAllSelectedOptions(WebElement e) {
		Select s=new Select (e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
		
	}
	public static WebElement getFirstSelectedOptions(WebElement e) {
		Select s=new Select (e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
		
	}
	public static void deSelectAll(WebElement e) {
		Select s= new Select(e);
		s.deselectAll();

	}
	public static boolean isMultiple(WebElement e) {
		Select s= new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;	
	}
	
}
