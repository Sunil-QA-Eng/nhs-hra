package uk.nhs.hra.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.nhs.hra.utility.Utility;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sunil Suhagiya
 */

public class SearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchPage.class);

    @FindBy(xpath = "//h2[@class='results-container__heading']")
    private WebElement headingElement;

    @CacheLookup
    @FindBy(xpath = "//label[@for='page_type-1']")
    WebElement bestPracticeCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[@for='page_type-2']")
    WebElement learningCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[@for='page_type-3']")
    WebElement pslCheckBox;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='results-container__heading']")
    private WebElement resultHeading;

    public String getFullSearchHeadingText() {
        log.info("Gets search result for covid 19");
        return getTextFromElement(headingElement).trim();
    }

    public void clickOnBestPracticeCheckBox() {
        log.info("Click on best practice check box");
        clickOnElement(bestPracticeCheckBox);
    }

    public void clickOnLearningCheckBox() {
        log.info("Click on learning check box");
        clickOnElement(learningCheckBox);
    }

    public void clickOnPSLCheckBox() {
        log.info("Click on Policies, Standards & Legislation check box");
        clickOnElement(pslCheckBox);
    }

    public String getResultHeading() {
        log.info("Getting search result heading");
        return getTextFromElement(resultHeading).trim();
    }
}