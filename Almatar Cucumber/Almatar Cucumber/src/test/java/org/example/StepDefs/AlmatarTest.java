package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AlmatarPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

import static org.example.StepDefs.Hooks.driver;

public class AlmatarTest {
    AlmatarPage page = new AlmatarPage();
    SoftAssert soft = new SoftAssert();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    Actions actions = new Actions(driver);

    @Given("User should open website url")
    public void preCondition(){
        wait.until(ExpectedConditions.urlContains("/en/"));
        soft.assertEquals(driver.getCurrentUrl(),Hooks.url);
        soft.assertAll();
    }

    @When("User select a destination")
    public void userSelectADestination() {
        page.destinationLocator.sendKeys("Barcelona");
        String barcelonaText = page.barcelonaTextLocator.getText();
        soft.assertTrue(true,barcelonaText);
        page.selectDestinationLocator.click();
        soft.assertAll();
    }

    @And("User select check out and check in date")
    public void userSelectCheckOutAndCheckInDate() {
        page.checkInLocator.click();
        page.checkInDateLocator.click();
        page.checkOutDateLocator.click();
    }

    @And("User select number of adults and children")
    public void userSelectNumberOfChildren() {
        page.guestRoomLocator.click();
        for(int i=0;i<2;i++){
            wait.until(ExpectedConditions.elementToBeClickable(page.increaseAdultLocator));
            page.increaseAdultLocator.click();
        }
        for(int i=0;i<2;i++){
            wait.until(ExpectedConditions.elementToBeClickable(page.increaseChildLocator));
            page.increaseChildLocator.click();
        }
    }

    @And("User select child age")
    public void userSelectChildAge() {
        page.childOneAgeDropDownLocator.click();
        page.childAgeLocator.click();
        page.childTwoAgeDropDownLocator.click();
        page.childAgeLocator.click();
    }

    @Then("User selected data should be appear correctly")
    public void userSelectedDataShouldBeAppearCorrectly() {
        page.applyButtonLocator.click();
        String checkInText = page.checkInTextLocator.getText();
        String checkOutText = page.checkOutTextLocator.getText();
        String guestText = page.guestTextLocator.getText();
        String roomText = page.RoomTextLocator.getText();
        soft.assertEquals(checkInText,"30 Sep, 2024","Date Not Found");
        soft.assertEquals(checkOutText,"05 Oct, 2024","Date Not Found");
        soft.assertEquals(guestText,"5 Guests","Text Not Found");
        soft.assertEquals(roomText,"1 Room","Text Not Found");
        soft.assertAll();
    }

    @And("User click on search button")
    public void userClickOnApplyAndSearchButton() {
        String searchButtonText = page.searchButtonLocator.getText();
        page.searchButtonLocator.click();
        soft.assertEquals(searchButtonText,"Search Hotels","Button Not Found");
        soft.assertAll();
    }

    @Then("User should be redirected to hotels page")
    public void userShouldBeRedirectedToHotelsPage() {
        String hotelPage= "https://almatar.com/en/hotels-in/Barcelona/Barcelona,-Barcelona,-Spain-603641/09-30-2024/10-05-2024/3_adult/0_5_children,0_5_children/?lng=2.17055&lat=41.37785&isGeo=1&radius=8315&type=location";
        wait.until(ExpectedConditions.urlContains(hotelPage));
        soft.assertEquals(driver.getCurrentUrl(),hotelPage,"Page Not Found");
        page.closeAdLocator.click();
        soft.assertAll();
    }

    @And("User select maximum price range")
    public void userSelectMaximumPriceRange() {
        wait.until(ExpectedConditions.visibilityOf(page.sliderHandleLocator));
        actions.moveToElement(page.sliderHandleLocator).perform();
        actions.dragAndDropBy(page.sliderHandleLocator, -188 , 0).build().perform();
    }

    @And("User select 5 stars rate")
    public void userSelectRate() {
        wait.until(ExpectedConditions.visibilityOf(page.fiveStarLocator));
        page.fiveStarLocator.click();
    }

    @Then("User should be able to print number and names of the hotels With their prices")
    public void userShouldBeAbleToPrintNumberAndNamesOfTheHotelsWithTheirPrices() {
        List<WebElement> price=page.hotelsPricesLocator;
        List<WebElement> name=page.hotelsNamesLocator;
        int i;
        for ( i=0;i<price.size();i++){
            System.out.println(price.get(i).getText());
        }
        for (WebElement element : name) {
            System.out.println(element.getText());
        }
        System.out.println("Hotels Count: "+i);
    }
}
