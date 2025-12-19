package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlePage {

    private WebDriver driver;

    private By heading = By.id("firstHeading");

    public ArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(heading).getText();
    }
}
