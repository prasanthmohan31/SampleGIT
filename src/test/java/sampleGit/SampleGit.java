package sampleGit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGit {

@Test
	public void loginTest() throws IOException{
		
	
	WebDriver wd =new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.bing.com");
	WebElement input = wd.findElement(By.id("q"));
			input.sendKeys("abc");
	input.submit();
	
	File f = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\PrasanthMohan\\workspace\\SampleGIT\\Screenshots\\bing.jpeg"));
	
	
	}
	
	
	}
