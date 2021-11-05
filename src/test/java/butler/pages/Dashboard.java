package butler.pages;

import butler.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div/nav/ul/li[1]/a")
    public WebElement orderNav;

    @FindBy(xpath = "/html/body//a[contains(@href,'delivery')]/@href")
    public WebElement deliveryNav;

    @FindBy(xpath = "/html/body//a[contains(@href,'clients')]/@href")
    public WebElement clientsNav;

    @FindBy(xpath = "/html/body//a[contains(@href,'search-orders')]/@href")
    public WebElement searchOrderNav;

    @FindBy(xpath = "/html/body//a[contains(@href,'recurring-orders')]/@href")
    public WebElement recurringOrdersNav;

    @FindBy(xpath = "//button/i[@class='fa fa-search']")
    public WebElement searchbtn;


}
