package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private By selectMenu = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By datePickerMenu = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenu);
        click(selectMenu);
        return new SelectMenuPage();
    }

    public DatePickerPage clickDatePickerMenu() {
        scrollToElementJS(datePickerMenu);
        click(datePickerMenu);
        return new DatePickerPage();
    }

}
