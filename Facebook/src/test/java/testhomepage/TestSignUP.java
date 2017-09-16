package testhomepage;

import common.CommonAPI;
import homepage.FbSignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestSignUP extends CommonAPI {
    @Test
    public void testSignUp() throws InterruptedException {
        FbSignUp facebook = PageFactory.initElements(driver,FbSignUp.class);
        facebook.SignUpFB();
        sleepFor(3);

        FbSignUp fbSignUp = PageFactory.initElements(driver, FbSignUp.class);
        fbSignUp.SignUpFB("Israt","Jahan","IsratEva@gmail.com","abc@220992",
                "september","22", "1992","female");
        facebook.getMonthWebElement();
        facebook.getDayWebElement();
        facebook.getYearWebElement();

    }

    private void sleepFor(int i) {
    }


}
