package tests;

import base.BaseWebTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArticlePage;
import pages.MainPage;

public class WikipediaWebTest extends BaseWebTest {

    @Test
    public void openMainPageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        Assert.assertTrue(driver.getTitle().contains("Wikipedia"));
    }

    @Test
    public void searchArticleTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.search("Selenium");

        ArticlePage articlePage = new ArticlePage(driver);
        Assert.assertEquals(articlePage.getTitle(), "Selenium");
    }

    @Test
    public void switchLanguageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.switchToRussian();
        Assert.assertTrue(driver.getCurrentUrl().contains("ru.wikipedia.org"));
    }

    @Test
    public void checkLanguagesBlockTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        Assert.assertTrue(mainPage.isLanguagesBlockDisplayed(), "Блок языков не найден на главной странице!");
    }

}
