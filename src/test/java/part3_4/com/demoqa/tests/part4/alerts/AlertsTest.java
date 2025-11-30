package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().goToAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText,
                "\n Actual & Expected Messages Do Not Match \n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlertsFramesWindowsCard().goToAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";

        Assert.assertEquals(actualConfirmationResult,expectedConfirmationResult,
                "\n You did not select Cancel! \n");
    }

    public void testPromptAlert() {
        String alertText = "Selenium with Java";

        var alertsPage = homePage.goToAlertsFramesWindowsCard().goToAlerts();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();

        String actualResult = alertsPage.getPromptAlertResult();
        String expectedResult = "You entered " + alertText;

        Assert.assertEquals(actualResult,expectedResult,
                "\n Actual & Expected Results do not match \n");
    }

}
