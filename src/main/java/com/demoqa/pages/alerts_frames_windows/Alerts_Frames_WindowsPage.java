package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");

    public ModalDialogsPage goToModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        clickJS(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage goToAlerts() {
        scrollToElementJS(alertsMenuItem);
        clickJS(alertsMenuItem);
        return new AlertsPage();
    }

}
