package com.qsp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortList {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///D:/htmlQsp/multipleSelectlist.html");
	WebElement hotel = driver.findElement(By.id("empire"));
	
	
	
	//creat object on arraylist;alltext

	ArrayList<String> alltext = new ArrayList<>();
	Select sel = new Select(hotel);
	
	//to get address of all options and store it in alloptions
	
      List<WebElement> alloptions = sel.getOptions();
      
      //get all options and store it in alltext
      
        for(WebElement option : alloptions)
      {
    	 String text = option.getText();
    	 alltext.add(text);
      }
      
     
      //sort alltext
        
    	  Collections.sort(alltext);
    	  
    	  //printalltext
    	  
    	  for(String text :alltext)
    	  {
    		System.out.println(text);  
    		  
    	  }
    	  
    	  driver.close();
      }
    	  
 }


