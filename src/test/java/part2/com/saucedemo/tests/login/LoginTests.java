package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUserName("standard_user");
        loginPage.setPassword("xyz3400");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        //Assert.assertFalse(actualMessage.contains("Epic sadface"));
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

}
