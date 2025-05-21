package uk.nhs.hra.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.nhs.hra.utility.Utility;

import java.util.List;
import java.util.stream.Collectors;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//button[@id='prefix-dismissButton']")
    WebElement noThanksButton;

    @FindBy(id = "accept-button")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='hero__caption-title']")
    WebElement headingText;

    @CacheLookup
    @FindBy(xpath = "//nav[@class=\"main-menu\"]/ul/li")
    List<WebElement> mainMenu;

    @CacheLookup
    @FindBy(id = "site-search")
    WebElement searchTextField;

    @CacheLookup
    @FindBy(className = "site-header__submit")
    WebElement searchSubmitButton;

    public void clickOnNoThanksButton() {
        clickOnElement(noThanksButton);
        log.info("Click on No Thanks button for newsletters");
    }

    public void clickOnAcceptAllCookies() {
        clickOnElement(acceptAllCookies);
        log.info("Click on accept all cookies");
    }

    public String getUrlTitle() {
        log.info("Retrieving page title");
        return driver.getCurrentUrl();
    }

    public String getTitleStatement() {
        log.info("Retrieving title statement");
        return getTextFromElement(headingText);
    }

    public List<String> getMainMenu() {
        return mainMenu.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void sendTextToSearchField(String text) {
        log.info("Send text to search field: " + text);
        sendTextToElement(searchTextField, text);
    }

    public void clickSearchSubmitButton() {
        log.info("Click search submit button");
        clickOnElement(searchSubmitButton);
    }
}