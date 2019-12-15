package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class TestTrial extends TestBase {
    @Test(description = "Verify login")
    public  void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        System.out.println(Driver.get().getTitle());

//        loginPage.navigateToDrive();
//        BrowserUtils.waitFor(2);
//        loginPage.navigateToCalendar();
//        BrowserUtils.waitFor(2);
        loginPage.menuNavigation("Tasks");
        System.out.println(loginPage.getPageSubtitle());
        BrowserUtils.waitFor(2);
        loginPage.menuNavigation("Mail");
        System.out.println(loginPage.getPageSubtitle());
        BrowserUtils.waitFor(2);


    }
}
