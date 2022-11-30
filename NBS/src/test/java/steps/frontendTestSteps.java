package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class frontendTestSteps {

    WebDriver driver;

    @Given("I navigate to the NBS To Do list website")
    public void i_navigate_to_the_nbs_to_do_list_website() {
        driver = UIChromeDriver.getDriver();
        driver.get("http://nbs-todolist-interview-389909.s3-website.eu-west-2.amazonaws.com/");


    }
    @Given("I enter a To Do list description with more than one hundred characters")
    public void i_enter_a_to_do_list_description_with_more_than_one_hundred_characters(String characters) {
        driver.findElement(By.xpath("//input[@id='content']")).sendKeys(characters);
    }
    @When("I select the Create to do button")
    public void i_select_the_create_to_do_button() {
        driver.findElement(By.xpath("//span[normalize-space()='Create todo']")).click();

    }
    @Then("I verify that to do list item has been created successfully {string}")
    public void i_verify_that_to_do_list_item_has_been_created_successfully(String characters) {
        Assert.assertEquals(characters, driver.findElement(By.xpath("//td[contains(text(),'wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww')]")).getText());

    }

    @Given("I enter a To Do list description with more than one hundred {string}")
    public void i_enter_a_to_do_list_description_with_more_than_one_hundred(String characters) {
        driver.findElement(By.xpath("//input[@id='content']")).sendKeys(characters);

    }

}
