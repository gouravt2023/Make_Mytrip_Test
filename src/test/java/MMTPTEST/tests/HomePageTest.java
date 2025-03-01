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

<<<<<<< HEAD
=======
    @Test

>>>>>>> b3b8fee4f468698c56a3c5dfb7606f7d11ea6d78
}


