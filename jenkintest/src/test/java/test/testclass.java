package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.googlehomepage;
import screenshot.screenshot;

public class testclass {
	
	WebDriver d;
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

	  d=new ChromeDriver();
	  
	  d.get("http://www.google.com");
	  
	  
	  googlehomepage g=new googlehomepage(d);
	  g.searching();
	  g.clicking();
	 screenshot s=new screenshot();
	 s.takescreen(d);
	  
	  
  }
}
