package com.ravi.package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void f() throws InterruptedException {
		System.out.println("Hello Ravikiran==========");
		System.setProperty("webdriver.chrome.drvier", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://sppoc.speridian.com:9001/siebel/app/publicsector/enu");
		driver.get("https://presalesdemosvr.speridian.com:9022/siebel/app/fins/enu?SWECmd=Start&SWEHo=presalesdemosvr.speridian.com");
		//driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
