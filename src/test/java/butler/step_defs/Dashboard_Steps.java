package butler.step_defs;

import butler.pages.Dashboard;
import butler.utilities.ConfigurationReader;
import butler.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dashboard_Steps {


    @And("user is on the Orders page")
    public void userIsOnTheOrdersPage() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.wait(3000);

        Dashboard orderpg = new Dashboard();
        orderpg.orderNav.click();

    }

//    @And("user is on the Delivery page")
//    public void userIsOnTheDeliveryPage() throws InterruptedException{
//        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
//        wait.wait(3000);
//
//        Dashboard orderpg = new Dashboard();
//        orderpg.deliveryNav.click();
//    }

}
