package com.qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot t = (TakesScreenshot)driver;
		//to take screen shot
		
		File src = t.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File("./screenshot3610192782938907957.png");
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
