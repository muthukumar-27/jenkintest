package screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import test.testclass;

public class screenshot  {

	
	public void takescreen(WebDriver d) throws IOException
	{
		
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(d);
		
		ImageIO.write(s.getImage(),"JPG",new File("C:\\Users\\Muthukumar\\git\\repository8\\jenkintest\\screenshots\\i.jpg"));
		
		
	}
}
