package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import test.testclass;

public class googlehomepage extends testclass {

	By search=By.name("q");
	By click=By.xpath("//div[starts-with(@class,'FPdoLc tfB0Bf')]//descendant::input[1]");
	
	WebDriver d;
	public googlehomepage(WebDriver d)
	{
		this.d=d;
	}
	
	public void searching()
	{
		d.findElement(search).sendKeys("ok google");
	}
	public void clicking()
	{
		d.findElement(click).click();
	}
}
