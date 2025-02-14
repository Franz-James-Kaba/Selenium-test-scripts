package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private static WebDriver driver;


    @BeforeAll
    public static void beforeAll(){
        driver = new ChromeDriver();
    }
    @AfterAll
    public static void afterAll(){
      driver.quit();
    }
    @Test
    public void openThePageAndCheckTheTittle(){
        //Set a timeout of 500 milliseconds
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        //Navigate to Google
        driver.get("https://www.wikipedia.com/");
        //Validate the title of the page returned
        String title = driver.getTitle();
        assertEquals("Wikipedia",title);

    }
    @Test
    public void searchForItem(){
        //Setting a timeout for the function
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //Navigate to Google
        driver.get("https://www.wikipedia.com/");

        //Enter the item in the search box
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Bugatti Veyron");
        searchBox.sendKeys(Keys.RETURN);
        String title = driver.getTitle();
        assertEquals("Bugatti Veyron - Wikipedia", title);



    }
}
