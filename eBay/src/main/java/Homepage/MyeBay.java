package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyeBay extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='gh-eb-My']/div/a[1]")
    public static WebElement MyeBay;

     public void clickOnMyeBay(){
         MyeBay.click();

     }
}
