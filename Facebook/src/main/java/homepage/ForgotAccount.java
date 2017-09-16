package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotAccount extends CommonAPI {
    @FindBy(how = How.XPATH,using = ".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
    public static WebElement forget;
    @FindBy(how = How.XPATH,using = ".//*[@id='identify_email']")
    public static WebElement email;

    public void clickOnForgotAcc(String Email){
        forget.click();
        email.sendKeys(Email);
    }

    public void goToSignUpPage() {
    }
}
