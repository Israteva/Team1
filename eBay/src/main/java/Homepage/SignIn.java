package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn extends CommonAPI {
    @FindBy(how = How.XPATH,using = ".//*[@id='userid']")
    public static WebElement Email;
    @FindBy(how = How.XPATH,using = ".//*[@id='pass']")
    public static WebElement pass;
    @FindBy(how = How.XPATH,using = ".//*[@id='sgnBt']")
    public static WebElement signbtn;

    public void Signin(String email,String password){
        Email.sendKeys(email);
        pass.sendKeys(password);
        signbtn.click();
    }
}
