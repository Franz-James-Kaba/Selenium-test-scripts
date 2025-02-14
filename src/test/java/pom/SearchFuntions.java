package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFuntions extends BasePage {
    // Locators using @FindBy annotation
    @FindBy(id = "searchInput")
    private WebElement searchInput;

    public SearchFuntions(WebDriver driver) {
        super(driver);
    }

    // Method to navigate to the Wikipedia homepage
    public void goToHomePage() {
        driver.get("https://www.wikipedia.com/");
    }

    // Method to perform a search
    public void searchFor(String query) {
        searchInput.sendKeys(query);
        searchInput.submit();
    }

    // Method to get the page title
    public String getPageTitle() {
        return driver.getTitle();
    }
}



