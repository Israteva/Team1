package homepage;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class facebookHomepage extends CommonAPI {
    @FindBy(how = How.ID, using = "email")
    WebElement emailorPhonebox;

    @FindBy(how = How.ID, using = "pass")
    WebElement passwordBox;

    @FindBy(how = How.ID, using = "u_0_2")
    WebElement loginBtn;

    public void loginFB(String email,String password){
        emailorPhonebox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }

}
