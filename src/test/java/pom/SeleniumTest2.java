package pom;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;

public class SeleniumTest2 {
    private static WebDriver driver;
    private static SearchFuntions searchFuntions;

    @BeforeAll
    public static void beforeAll() {
        driver = new ChromeDriver();
        searchFuntions = new SearchFuntions(driver);
    }
   @AfterAll
   public static void afterAll() {
        driver.quit();
   }
   @Test
    public void searchForItems(){
        searchFuntions.goToHomePage();
        searchFuntions.searchFor("Bugatti Veyron");

        String title = searchFuntions.getPageTitle();
        assertEquals("Bugatti Veyron - Wikipedia", title);
   }
}
