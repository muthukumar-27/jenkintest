package screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import test.testclass;

public class screenshot  {

	
	public void takescreen(WebDriver d) throws IOException
	{
		
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(d);
		
		ImageIO.write(s.getImage(),"JPG",new File("D:\\eclipse\\jenkintest\\screenshots\\i.jpg"));
		
		
		
	}
}
