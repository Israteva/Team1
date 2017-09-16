package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FbSignUp extends CommonAPI{

    @FindBy(how = How.NAME, using ="firstname")
    public static WebElement FirstNameBox;

    @FindBy(how = How.NAME, using = "lastname")
    public static WebElement LastNameBox;

    @FindBy(how = How.NAME,using = "reg_email__")
    public static WebElement Email;

    @FindBy (how = How.NAME,using = "reg_email_confirmation__")
    public static WebElement reEmail;

    @FindBy(how = How.NAME,using = "reg_passwd__")
    public static WebElement password;

    @FindBy(how = How.NAME,using = "month")
    public static WebElement monthDropdown;

    @FindBy(how = How.NAME,using = "day")
    public static WebElement dayDropdown;

    @FindBy(how = How.NAME,using = "year")
    public static WebElement yearDropdown;

    @FindBy(how = How.XPATH,using = ".//input[@name='sex' and @value='1']")
    public static WebElement FemaleBtn;

    @FindBy(how = How.NAME,using = "websubmit")
    public static WebElement createAcc;

    public WebElement getMonthWebElement(){
        return monthDropdown;
    }
    public WebElement getDayWebElement() {
        return dayDropdown;
    }

    public WebElement getYearWebElement() {
       return yearDropdown;
    }

    public void SignUpFB(String FirstName,String LastName,String email,String pass,String month,String day,String year,
                         String gender) throws InterruptedException {
        FirstNameBox.sendKeys(FirstName);
        sleep(1000);

        LastNameBox.sendKeys(LastName);
        sleep(1000);

        Email.sendKeys(email);
        sleep(1000);

        reEmail.sendKeys(email);
        sleep(1000);

        password.sendKeys(pass);
        sleep(1000);

        inputBirthday("September", "22", "1992", month, day, year);
        sleep(1000);

        if (gender.equalsIgnoreCase("female")) {
            FemaleBtn.click();
        }
        sleep(1000);
        createAcc.click();

    }

    private void inputBirthday(String monthElem, String dayElelm, String yearElem, String month, String day, String year) {
        month = month.toLowerCase().substring(0, 3);
        month = month.substring(0,1).toUpperCase() + month.substring(1,3);

        Select selMonth = new Select(driver.findElement(By.xpath(month)));
        selMonth.selectByVisibleText(month);

        Select selDay = new Select(driver.findElement(By.xpath(day)));
        selDay.selectByVisibleText(day);

        Select selYear = new Select(driver.findElement(By.xpath(year)));
        selYear.selectByVisibleText(year);
    }

    public void SignUpFB() {
    }
}
