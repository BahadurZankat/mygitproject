package tests;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class NewTest {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() throws InterruptedException {
     driver.get("http://demo.guru99.com/test/newtours/");
     //Thread.sleep(1000*60);
     System.out.println(driver.getCurrentUrl().toString());
     System.out.println(driver.getTitle().toString());
     driver.findElement(By.name("userName")).sendKeys("guru99");
     
     driver.findElement(By.name("password")).sendKeys("guru99");
     
     driver.findElement(By.name("submit")).click();
     //Thread.sleep(1000*60);
     System.out.println(driver.getCurrentUrl().toString());
     System.out.println(driver.getTitle().toString());
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
   driver = new ChromeDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
	  System.out.println("Ed");
   driver.quit();
  }
 
}
