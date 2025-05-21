package uk.nhs.hra.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.nhs.hra.pages.HomePage;
import uk.nhs.hra.pages.SearchPage;

import java.util.List;

/**
 * Created by Sunil Suhagiya
 */

public class HomeSteps {

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @And("I click on thanks button on news letter subscription")
    public void iClickOnThanksButtonOnNewsLetterSubscription() {
        new HomePage().clickOnNoThanksButton();
    }

    @And("I click on Accept All cookies")
    public void iClickOnAcceptAllCookies() {
        new HomePage().clickOnAcceptAllCookies();
    }

    @Then("I verify the url is {string}")
    public void iVerifyTheUrlIs(String url) {
        Assert.assertEquals(new HomePage().getUrlTitle(), url,"The url did not match");
    }

    @And("I verify the heading of home page {string}")
    public void iVerifyTheHeadingOfHomePage(String headingText) {
        Assert.assertEquals(new HomePage().getTitleStatement(), headingText,"The title statement did not match");
    }

    @Then("I should see the following menu items:")
    public void iShouldSeeTheFollowingMenuItems(DataTable dataTable) {
        List<String> expectedMenuItems = dataTable.asList();
        System.out.println("Expected Menu Items:");
        expectedMenuItems.forEach(item -> System.out.println(" - " + item));

        List<String> actualMenuItems = new HomePage().getMainMenu();
        System.out.println("Actual Menu Items:");
        actualMenuItems.forEach(item -> System.out.println(" - " + item));
        Assert.assertEquals(expectedMenuItems, actualMenuItems, "Menu items do not match");
    }

    @When("I send {string} to search text field")
    public void iSendToSearchTextField(String text) {
        new HomePage().sendTextToSearchField(text);
    }

    @And("I click on search submit button")
    public void iClickOnSearchSubmitButton() {
        new HomePage().clickSearchSubmitButton();
    }

    @Then("I am able to see {string}")
    public void iAmAbleToSee(String result) {
        Assert.assertEquals(new SearchPage().getFullSearchHeadingText(),result, "Search result did not match");
    }
}
