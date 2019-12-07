package mavenpkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterpass extends baseclass {
//public static WebDriver driver;

//@Test(dataProvider="data1")
public void test1(String s) throws IOException {
    baseclass b=new baseclass();
    b.open();
	registerPO rp=new registerPO(driver);
	rp.enterdetails("vijaymane3333", "7028585296");
//	 WebDriverManager.chromedriver().setup();
//	 driver=new ChromeDriver();
//	driver.get(s);
//	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
}
//@DataProvider(name="data1")
//public Object[][] datapass1(){
//	Object[][] obj=new Object[3][1];
//	obj[0][0]="https://www.google.com/";
//	obj[1][0]="https://accounts.google.com/signin";
//	obj[2][0]="https://mcgregor.visulon.com/McGregorQA/default.aspx";
//	return obj;
//	
//}

}
