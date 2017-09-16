package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Toys extends CommonAPI{
    @FindBy(how = How.XPATH,using = ".//*[@id='s0-container']/li[10]/a")
    public static WebElement toys;

    public void ebayToys(){
        toys.click();
    }
}
