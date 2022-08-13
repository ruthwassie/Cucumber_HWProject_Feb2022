package pages;

import java.util.Random;
//import java.io.File;
//import java.io.IOException;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver; 
	
	public static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe"); 
		driver = new ChromeDriver(); // ChromeDriver is a class, 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	}
	
	public int generateRandomNumber() {
		Random rnd = new Random(); 
		int randomNumber = rnd.nextInt(999); 
		return randomNumber; 
	}
}
	
//	
//	public void takeScreenshot(WebDriver driver) {		
//		TakesScreenshot ts = (TakesScreenshot)driver; 
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE); //chose the 3rd one saying getScreenshotAs(null or target)
//		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss"); //hover over and change it to simple data format 
////														(month date year_hour minute second)
//		Date date = new Date(); //import Date(java.util)
//		String label = formatter.format(date); //choose the first one (format(Date date) // then run and see the name of the screenshot report name
//		try {
//			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
//			
//			//FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() is changed in lable + ".png"));
//			//hover over and choose the "surround with try/catch, then add "System.currentTimeMillis() + ".png". Png is the extention for the screenshot
//		} catch (IOException e) {
//			e.printStackTrace();
//		} //after .copyfile chose the first one (File srcFile(i.e.source File), File destFile(i.e. Destination File)
//		//screenshot is the name of the folder that we put our screenshot, then hover over choose "surround with try/catch"
//		
//	}
//
//}


