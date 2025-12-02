package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{

    private By fullNameField = By.id("userName");
    private By currentAddressTextBox = By.id("currentAddress");
    private By permanentAddressTextBox = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress() {
        explicitWaitUntilVisible(5,currentAddressResult);
        return getText(currentAddressResult);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address){
        scrollToElementJS(currentAddressTextBox);
        sendKeys(find(currentAddressTextBox),Keys.chord(address));
    }

    public void setPermanentAddress(String address){
        setCurrentAddress(Keys.chord(Keys.TAB,address));
    }

    public void setFullName(String name){
        scrollToElementJS(fullNameField);
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField),Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB,email));
    }

}
