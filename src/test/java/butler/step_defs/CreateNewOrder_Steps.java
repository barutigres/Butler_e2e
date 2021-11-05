package butler.step_defs;

import butler.pages.Orders;
import butler.pages.SignIn;
import butler.utilities.ConfigurationReader;
import butler.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewOrder_Steps {


    @Given("user is logged in")
    public void userIsLoggedIn() {

        Driver.get().get(ConfigurationReader.get("url"));
        SignIn signInUser=new SignIn();

        signInUser.userName.sendKeys("guest");
        signInUser.password.sendKeys("guest");
        signInUser.signInBtn.click();

    }

    @When("user clicks New Order and enters three digit code")
    public void userClicksNewOrderAndEntersThreeDigitCode() {
        Orders orders=new Orders();
        orders.newOrder.click();
        orders.hotelCode.sendKeys("333");


    }

    @And("user should be directed to Create New Order page")
    public void userShouldBeDirectedToCreateNewOrderPage() throws InterruptedException {
        Orders orders=new Orders();

        WebDriverWait wait= new WebDriverWait(Driver.get(), 20);
        wait.wait(3000);
        orders.nextBtn.click();


        wait.until(ExpectedConditions.urlContains("orders/location/1/order/"));

    }

    @And("user enters order details")
    public void userEntersOrderDetails() {
        Orders orders=new Orders();

        orders.name.sendKeys("some name");

        orders.roomNumber.sendKeys("12");
        orders.phone.sendKeys("+5515555555");

    }

    @And("user enters credit card information")
    public void userEntersCreditCardInformation() throws InterruptedException {
        Orders orders=new Orders();

        orders.cardPaymentType.click();

        WebDriverWait wait= new WebDriverWait(Driver.get(), 20);
        wait.wait(3000);

        orders.cardNumber.sendKeys("4111 1111 1111 1111");
        orders.monthAndYear.sendKeys("1124");
        orders.CVV.sendKeys("123");
        orders.postal.sendKeys("123");
        orders.chargeCardBtn.click();

        Driver.get().getWindowHandle();
    }

    @And("user selects order from categories")
    public void userSelectsOrderFromCategories() {
        Orders orders=new Orders();
        orders.convenience.click();
        orders.snacks.click();
        orders.menuItems.click();


    }

    @Then("user should be able to save their order")
    public void userShouldBeAbleToSaveTheirOrder() {
        //        orders.savebtn.click();
    }
}
