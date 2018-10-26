package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver webDriver;

    @Given("^I have access to go to homepage$")
    public void iHaveAccessToGoToHomepage() throws Throwable {
        webDriver=new ChromeDriver();

        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I click PetTypes button$")
    public void iClickPetTypesButton() throws Throwable {
        webDriver.findElement(By.linkText("PET TYPES")).click();

    }

    @Then("^Validate if PetTypes title exist$")
    public void validateIfPetTypesTitleExist() throws Throwable {
        webDriver.findElement(By.xpath("//h2[contains(text(),'Pet Types')]")).isDisplayed();

    }


    @When("^I click addNewOwnerButton$")
    public void iClickAddNewOwnerButton() throws Throwable {
        webDriver.findElement(By.xpath("//a[text()='Owners']")).click();
        webDriver.findElement(By.xpath("//a[@href='/petclinic/owners/add']")).click();
        webDriver.findElement(By.id("firstName")).sendKeys("Daniela");
        webDriver.findElement(By.id("lastName")).sendKeys("Ileana");
        webDriver.findElement(By.id("address")).sendKeys("Iuliu Maniu");
        webDriver.findElement(By.id("city")).sendKeys("Bucuresti");
        webDriver.findElement(By.id("telephone")).sendKeys("01234567");
        webDriver.findElement(By.xpath("//button[contains(text(),'Add Owner')]")).click();
    }

    @Then("^create a new owner$")
    public void createANewOwner() throws Throwable {
       webDriver.findElement(By.xpath("//a[contains(text(),'Daniela Ileana')]"));
    }


}