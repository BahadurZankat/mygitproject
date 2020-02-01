package tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class NewTest {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() {
 driver.get("https://www.softwaretestingmaterial.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\Desktop\\Eclipse_Juno\\chromedriver.exe");
   driver = new ChromeDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
	  System.out.println("Ed");
   //driver.quit();
  }
 
}