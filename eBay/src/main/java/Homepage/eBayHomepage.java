package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class eBayHomepage extends CommonAPI {
    @FindBy(how = How.ID,using = "gh-ac")
    public static WebElement searchTab;
    @FindBy(how = How.XPATH, using = ".//*[@id='gh-btn']")
    public static WebElement searchBtn;

    public void searchFor(String query){
        searchTab.sendKeys(query);
        searchBtn.click();
    }
}
