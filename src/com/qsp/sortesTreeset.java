package com.qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortesTreeset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/multipleSelectlist.html");
		WebElement hotel = driver.findElement(By.id("empire"));
		Select sel = new Select(hotel);
		
		//creat treeset
	    TreeSet<String> texts= new TreeSet<>();
	    
     
        //to get object of treeset; alltext
	    	List<WebElement> alloptions = sel.getOptions();
     
       //get alloption and store it in the alltext
	    	for(WebElement text : alloptions)
	    	{
	    		String alltext = text.getText();
	    		System.out.println(alltext);
	    	}
	    	
       
       
       //print treeset
       
	    	for( String s : texts)
	    	{
	    		System.out.println(s);
	    	}
	    	driver.close();
	}

}
