package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EbayDailyDeals extends CommonAPI {
    @FindBy(how = How.XPATH,using = ".//*[@id='gh-p-1']/a")
    public static WebElement Deals;

    public void DailyDeals(){
        Deals.click();
    }
}
