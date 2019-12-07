package mavenpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
public static WebDriver driver;
public FileInputStream fp;
public Properties prop;
@Test
public void open() throws IOException {
	fp=new FileInputStream("C:\\Selenium\\MyWorkspace\\maven.demo\\src\\test\\java\\mavenpkg\\config.properties");
       prop=new Properties();
       prop.load(fp);
       if(prop.getProperty("browse").equals("chrome")) {
   		WebDriverManager.chromedriver().setup();
   		driver=new ChromeDriver();
   	}else if(prop.getProperty("browse").equals("firefox")) {
   		WebDriverManager.firefoxdriver().setup();
   		driver=new FirefoxDriver();
   	}else {
   		System.out.println("not found");
   	}
   	driver.get(prop.getProperty("URL"));
   	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	
   }

}

