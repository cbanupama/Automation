package com.qsp;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class redBrickCountMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://redbrickhealth.com/");
		String xp = " //a[.='RedBrick Health']/../..//a[.='Solutions']";
		WebElement solutions = driver.findElement(By.xpath(xp));
		
		Actions act = new Actions(driver);
		act.moveToElement(solutions).perform();
		Thread.sleep(1000);
		
		String xp1 = "//a[.='RedBrick Health']/../..//a[.='Solutions']/..//a[@class='nav-link']";
		List<WebElement> dropdown = driver.findElements(By.xpath(xp1));
		
		int count = dropdown.size();
		System.out.println(count);
		
		for(WebElement s : dropdown)
		{
			String text = s.getText();
			System.out.println(text);
		}
		
		driver.close();

	}

}
