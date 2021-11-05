package butler.pages;

import butler.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders {

    public Orders(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div[1]/div/div[1]/div/div[2]/a")
    public WebElement newOrder;
    @FindBy(xpath = "//input[@id='hotel-code']")
    public WebElement hotelCode;
    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextBtn;
    @FindBy(xpath = "//*[@id=\"clientName\"]")
    public WebElement name;
    @FindBy(xpath = "//*[@id=\"hotel\"]")
    public WebElement hotel;
    @FindBy(xpath = "//*[@id=\"hub\"]")
    public WebElement hub;
    @FindBy(xpath = "//*[@id=\"room\"]")
    public WebElement roomNumber;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement phone;
    @FindBy(xpath = "//*[@id=\"select-order\"]")
    public WebElement orderType;
    @FindBy(xpath = "//span[normalize-space(text())='Card']")
    public WebElement cardPaymentType;

    @FindBy(xpath = "//iframe[@id='sq-card-number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//iframe[@id='sq-expiration-date']")
    public WebElement monthAndYear;
    @FindBy(xpath = "//iframe[@id='sq-cvv']")
    public WebElement CVV;
    @FindBy(xpath = "//iframe[@id='sq-postal-code']")
    public WebElement postal;
    @FindBy(xpath = "//button[normalize-space(text())='Charge card']")
    public WebElement chargeCardBtn;

    @FindBy(xpath = "//span[text()='Convenience']")
    public WebElement convenience;
    @FindBy(xpath = "//span[text()='Lunch & Dinner']")
    public WebElement LunchANDdinner;
    @FindBy(xpath = "//span[text()='Breakfast']")
    public WebElement breakfast;

    @FindBy(xpath = "//span[text()='Snacks']")
    public WebElement snacks;
    @FindBy(xpath = "//span[text()='Essentials']")
    public WebElement essentials;
    @FindBy(xpath = "//*[@ng-click='vm.pickMenuItem(item)'][1]")
    public WebElement menuItems;

    @FindBy(xpath = "//button[normalize-space(text())='Save']")
    public WebElement savebtn;
}
