package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBoxMenu();
        textBoxPage.setFullName("Rex Allen");
        textBoxPage.setEmail("test@gmail.com");
        textBoxPage.setCurrentAddress("Tashkent,Uzbekistan");
        textBoxPage.setPermanentAddress("Uzbekistan");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Uzbekistan"),
                "\n Actual & Expected Address do not match! \n");
    }

}
