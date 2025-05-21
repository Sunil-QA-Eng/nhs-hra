package uk.nhs.hra.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.nhs.hra.pages.SearchPage;

/**
 * Created by Sunil Suhagiya
 */

public class SearchSteps {

    @When("I tick check box for best practice")
    public void iTickCheckBoxForBestPractice() {
        new SearchPage().clickOnBestPracticeCheckBox();
    }

    @Then("I verify the {string}")
    public void iVerifyThe(String text) {
        Assert.assertEquals(new SearchPage().getResultHeading(), text, "Search result heading not matching");
    }

    @When("I tick check box for Learning")
    public void iTickCheckBoxForLearning() {
        new SearchPage().clickOnLearningCheckBox();
    }

    @When("I tick check box for Policies, Standards & Legislation")
    public void iTickCheckBoxForPoliciesStandardsLegislation() {
        new SearchPage().clickOnPSLCheckBox();
    }
}
