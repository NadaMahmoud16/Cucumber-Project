package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlmatarPage {
    public AlmatarPage(){
        PageFactory.initElements(Hooks.driver,this);
    }

    //Locators
    @FindBy(xpath = "//input[@id=\"typeahead-http\"]")
    public WebElement destinationLocator;
    @FindBy(xpath = "//ngb-typeahead-window[@class=\"dropdown-menu show ng-star-inserted\"]/button[1]")
    public WebElement selectDestinationLocator;
    @FindBy(xpath = "//ngb-typeahead-window[@class=\"dropdown-menu show ng-star-inserted\"]/button[1]/div//b")
    public WebElement barcelonaTextLocator;
    @FindBy(xpath = "//div[@class=\"almatar-calendar__date\"]")
    public WebElement checkInLocator;
    @FindBy(xpath = "//div[@class=\"p-datepicker-group-container ng-tns-c94-1 ng-star-inserted\"]/div[1]/div[2]/table/tbody/tr[5]/td[2]/span")
    public WebElement checkInDateLocator;
    @FindBy(xpath = "//div[@class=\"almatar-calendar almatar-calendar--home almatar-calendar--range almatar-calendar--nights\"]/div[1]//div[@class=\"almatar-calendar__date\"]")
    public WebElement checkInTextLocator;
    @FindBy(xpath = "//div[@class=\"p-datepicker-group-container ng-tns-c94-1 ng-star-inserted\"]/div[2]/div[2]/table/tbody/tr[1]/td[7]/span")
    public WebElement checkOutDateLocator;
    @FindBy(xpath = "//div[@class=\"almatar-calendar almatar-calendar--home almatar-calendar--range almatar-calendar--nights\"]/div[2]//div[@class=\"almatar-calendar__date\"]")
    public WebElement checkOutTextLocator;
    @FindBy(xpath = "//*[@class=\"dropdown__item panel-mobile-overlay\"]//span[1]")
    public WebElement guestRoomLocator;
    @FindBy(xpath = "//*[@class=\"passenger-control__button increase-1 decrement ng-star-inserted\"]")
    public WebElement increaseAdultLocator;
    @FindBy(xpath = "//*[@class=\"increase-2 passenger-control__button decrement ng-star-inserted\"]")
    public WebElement increaseChildLocator;
    @FindBy(xpath = "//div[@class=\"children-age__container\"]/div[1]//ng-select")
    public WebElement childOneAgeDropDownLocator;
    @FindBy(xpath = "//div[@class=\"children-age__container\"]/div[2]//ng-select")
    public WebElement childTwoAgeDropDownLocator;
    @FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]/div[2]/div[5]")
    public WebElement childAgeLocator;
    @FindBy(xpath = "//div[@class=\"dropdown__item panel-mobile-overlay\"]/span[1]")
    public WebElement guestTextLocator;
    @FindBy(xpath = "//div[@class=\"dropdown__item panel-mobile-overlay\"]/span[2]")
    public WebElement RoomTextLocator;
    @FindBy(xpath = "//div[@class=\"edit-search-sheet__action\"]/button")
    public WebElement applyButtonLocator;
    @FindBy(xpath = "//form[@name=\"searchHotels\"]/button")
    public WebElement searchButtonLocator;
    @FindBy(xpath = "//div[@class=\"almatar-offer-popup__header\"]//svg-icon")
    public WebElement closeAdLocator;
    @FindBy(xpath = "//div[@class=\"noUi-handle noUi-handle-upper\"]")
    public WebElement sliderHandleLocator;
    @FindBy(xpath = "//div[@class=\"checkbox\"]/div[1]//span[@class=\"checkmark\"]")
    public WebElement fiveStarLocator;
    @FindBy(xpath = "//p[@class=\"hotel-item__prices--current ng-star-inserted\"]")
    public List<WebElement> hotelsPricesLocator;
    @FindBy(xpath = "//h3[@class=\"p-element hotel-item__name\"]")
    public List<WebElement> hotelsNamesLocator;
}
