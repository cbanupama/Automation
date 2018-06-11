package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/checkbox.html");
		
		List<WebElement>  Allcb= driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		//To count the check box
		int count = Allcb.size();
		System.out.println(count);
		
	//To click the button
	/*	for(int i=0; i<count; i++)
		{
			WebElement cb = Allcb.get(i);
			cb.click();
			Thread.sleep(1000);
		}
		
	//To click in reverse order
		for(int i=count-1;i>=0;i--)
		{
			WebElement cb = Allcb.get(i);
			cb.click();
			Thread.sleep(1000);
			
		}
		
	//To click even checkboxes
		for(int i=0; i<count; i++)
		{
			if(i%2==1)
			{
				WebElement cb = Allcb.get(i);
				cb.click();
				Thread.sleep(1000);
			}
		}*/
		
		//To click odd checkboxes
		for(int i=0;i<count;i++)
		{
			if(i%2==0)
			{
				WebElement cb = Allcb.get(i);
				cb.click();
				Thread.sleep(1000);
			}
			
		}
		
		
		
		driver.close();
		
	}

}
