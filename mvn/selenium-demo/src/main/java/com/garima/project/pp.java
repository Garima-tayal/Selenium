package com.garima.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class pp {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
	    WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("title:" +driver.getTitle());
	}

}