package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class eBayRecentlyView extends CommonAPI {
    @FindBy(how = How.XPATH ,using = ".//*[@id='gh-eb-My-o']/ul/li[2]/a")
    public static WebElement recentView;

    public void clickOnRecentlyView(){
        recentView.click();
    }
}
