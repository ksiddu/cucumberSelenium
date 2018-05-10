package com.bdd.utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class BrowserFactory {

	public static WebDriver getDriver(String browserType) {
		WebDriver driver = null;

		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
		
		/*
		switch (browserType) {
		case "chrome":
			s = s + "/exefiles/mac/chromedriver";
			break;
		case "firefox":
			s = s + "/exefiles/mac/geckoriver";
			break;
		
		case "phantomJS":
			s = s + "/exefiles/mac/phantomJSdriver";
			break;

		case "safari":
			s = s + "/exefiles/mac/safaridriver";
			break;
		
		default:
			s = s + "/exefiles/mac/chromedriver";
			break;
		}
		*/
		if(browserType.contentEquals("chrome")){
			s = s + "/exefiles/mac/chromedriver";
			System.setProperty("webdriver.chrome.driver", s);
			driver = new ChromeDriver();
		}
		else if(browserType.contentEquals("firefox")){
			s = s + "/exefiles/mac/geckodriver";
			System.setProperty("webdriver.gecko.driver", s);
			driver = new FirefoxDriver();
		}
		
		System.out.println("Setting {browserType} driver path : " + s);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}
