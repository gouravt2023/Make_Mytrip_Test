package MMTPTEST.tests;

import MMTPTEST.TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void login () throws InterruptedException
    {
        landingPage.loginApp();
    }
    @Test
    public void validateOtp()
    {
        landingPage.enterOtp();
    }
    @Test
    public void validatePersonalDetails()
    {
        landingPage.enterPersonalDetails();
    }

    @Test

}


