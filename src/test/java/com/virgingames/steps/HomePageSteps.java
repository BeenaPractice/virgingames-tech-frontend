package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^User accepts cookies$")
    public void userAcceptsCookies() {
        new HomePage().clickOnCookies();
    }

    @When("^I click on Online Slots link$")
    public void iClickOnOnlineSlotsLink() {
    }

    @Then("^I should navigate to Online Slots page successfully$")
    public void iShouldNavigateToOnlineSlotsPageSuccessfully() {
    }
}
