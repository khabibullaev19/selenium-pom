package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private By selectMenu = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By datePickerMenu = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text()='Slider']");

    public SliderPage clickSliderMenu() {
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }

    public ProgressBarPage clickProgressBarMenu(){
        scrollToElementJS(progressBarMenuItem);
        clickJS(progressBarMenuItem);
        return new ProgressBarPage();
    }

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
