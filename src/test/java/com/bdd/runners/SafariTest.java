package com.bdd.runners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafariOptions options = new SafariOptions();
		options.useCleanSession(true);
		WebDriver driver = new SafariDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		System.out.println("Google Page Title - " + driver.getTitle());
		
		driver.quit();
	}

}
