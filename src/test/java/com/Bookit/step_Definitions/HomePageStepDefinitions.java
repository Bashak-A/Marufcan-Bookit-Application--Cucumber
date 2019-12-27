package com.Bookit.step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class HomePageStepDefinitions {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("I am opening the login page");
    }
    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("I am logging in");
    }
    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("I can see the home page now");
    }
    @Then("the title should be correct")
    public void the_title_should_be_correct() {
        System.out.println("Title is correct");
    }
    @When("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        System.out.println("I am login in as teacher");
    }
    @When("user logs in as a team member")
    public void user_logs_in_as_a_team_member() {
        System.out.println("I am login in as member");
    }




}
