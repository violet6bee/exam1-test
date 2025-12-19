package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;

    private By searchInput = By.id("searchInput");
    private By languageRu = By.id("js-link-box-ru");
    private By languagesBlock = By.cssSelector(".central-featured");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.wikipedia.org/");
    }

    public void search(String text) {
        driver.findElement(searchInput).sendKeys(text);
        driver.findElement(searchInput).submit();
    }

    public void switchToRussian() {
        driver.findElement(languageRu).click();
    }

    public boolean isLanguagesBlockDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement block = wait.until(ExpectedConditions.visibilityOfElementLocated(languagesBlock));
            return block.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
