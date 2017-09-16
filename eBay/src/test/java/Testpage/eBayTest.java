package Testpage;

import Homepage.*;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class eBayTest extends CommonAPI {


    @Test(priority = 3)
    public void testToys(){
        Toys ebay = PageFactory.initElements(driver,Toys.class);
        ebay.ebayToys();
    }
    @Test(priority = 4)
    public void testDeals(){
        EbayDailyDeals ebay = PageFactory.initElements(driver ,EbayDailyDeals.class);
        ebay.DailyDeals();
    }
    @Test(priority = 5)
    public void testSearch() {
        eBayHomepage hp = PageFactory.initElements(driver, eBayHomepage.class);
        hp.searchFor("guitar");
    }
    @Test(priority = 1)
    public void testHomeandGarden(){
        HomeGarden ebay = PageFactory.initElements(driver,HomeGarden.class);
        ebay.HomeGarden();
    }
    @Test(priority = 2)
    public void testFurniture(){
        HomeGarden ebay = PageFactory.initElements(driver,HomeGarden.class);
        ebay.Furniture();
    }
    @Test(priority = 6)
    public void testClick(){
        MyeBay ebay = PageFactory.initElements(driver,MyeBay.class);
        ebay.clickOnMyeBay();
    }
    @Test(priority = 7)
    public void testRecentView(){
        eBayRecentlyView eb = PageFactory.initElements(driver, eBayRecentlyView.class);
        eb.clickOnRecentlyView();
    }
    @Test(priority = 8)
    public void testsignIn(){
        SignIn ebay =PageFactory.initElements(driver,SignIn.class);
        ebay.Signin("IsratEva@gmail.com","abc123");
    }
}
