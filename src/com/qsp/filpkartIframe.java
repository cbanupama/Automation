package com.qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkartIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("moto");
		Thread.sleep(2000);
		List<WebElement> mobiles = driver.findElements(By.xpath("//Span[@class='DX_PBc']"));
		Thread.sleep(2000);
		int count = mobiles.size();
		Thread.sleep(2000);
		System.out.println(count);
	
		
		
		for(WebElement searches : mobiles)
		{
			String s = searches.getText();
			System.out.println(s);
		}
			for(WebElement searches : mobiles)
			{
				String s = searches.getText();
			if(s.equals("moto g5 s plus mobile"))
			{
				searches.click();
				break;
			}
			
		}
		
		
		
		
		


	}

}
