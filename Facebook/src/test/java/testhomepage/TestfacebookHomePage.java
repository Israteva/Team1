package testhomepage;

import common.CommonAPI;
import homepage.FbSignUp;
import homepage.ForgotAccount;
import homepage.facebookHomepage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestfacebookHomePage extends CommonAPI {
    @Test(priority = 4)
    public void testLogin(){
        facebookHomepage fb = PageFactory.initElements(driver,facebookHomepage.class);
        fb.loginFB("Israteva@gmail.com","1234");
    }

    @Test(priority = 1)
    public void testForgotAcc(){
        ForgotAccount fb = PageFactory.initElements(driver,ForgotAccount.class);
        fb.clickOnForgotAcc("IsratEva@gmail.com");
    }



}
