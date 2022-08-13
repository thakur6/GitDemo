package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
  public static void captureScreen(WebDriver driver, String name) throws IOException {
	  TakesScreenshot tcs=(TakesScreenshot) driver;
	  File source=tcs.getScreenshotAs(OutputType.FILE);
	  String path=System.getProperty("user dir")+"//Screenshot//"+name+".png";
	  File dest =new File(path);
	  FileHandler.copy(source, dest);
	  System.out.println("Screenshot capture");
	  
  }
}
