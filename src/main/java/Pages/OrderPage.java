package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {

    //поля ввода
    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private SelenideElement inputName;

    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private SelenideElement inputLastName;

    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement inputAddress;

    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private SelenideElement inputStation;

    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement inputPhoneNumber;

    @FindBy(xpath = ".//li/button[@value='1']")
    private SelenideElement firstStation;

    @FindBy(xpath = ".//button[text()='Далее']")
    private SelenideElement buttonFirstStep;

    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement inputDate;

    @FindBy(xpath = ".//div[text()='13']")
    private SelenideElement currentDate;

    @FindBy(xpath = ".//div[@class='Dropdown-control']")
    private SelenideElement inputRentTime;

    @FindBy(xpath = ".//div[text()='сутки']")
    private SelenideElement rentTime;

    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement inputComment;

    @FindBy(xpath = ".//label[@for='grey']")
    private SelenideElement inputColor;

    @FindBy(xpath = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")
    private SelenideElement buttonOrder;

    @FindBy(xpath = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']")
    private SelenideElement buttonYes;

    @FindBy(xpath = ".//div[text()='Заказ оформлен']")
    private SelenideElement orderConfirmedText;



    public SelenideElement getInputName() {
        return inputName;
    }

    public SelenideElement getInputLastName() {
        return inputLastName;
    }

    public SelenideElement getInputAddress() {
        return inputAddress;
    }

    public SelenideElement getInputStation() {
        return inputStation;
    }

    public SelenideElement getInputPhoneNumber() {
        return inputPhoneNumber;
    }

    public SelenideElement getFirstStation() {
        return firstStation;
    }

    public SelenideElement getButtonFirstStep() {
        return buttonFirstStep;
    }

    public SelenideElement getInputDate() {
        return inputDate;
    }

    public SelenideElement getInputRentTime() {
        return inputRentTime;
    }

    public SelenideElement getInputComment() {
        return inputComment;
    }

    public SelenideElement getInputColor() {
        return inputColor;
    }

    public SelenideElement getCurrentDate() {
        return currentDate;
    }

    public SelenideElement getRentTime() {
        return rentTime;
    }

    public SelenideElement getButtonOrder() {
        return buttonOrder;
    }

    public SelenideElement getButtonYes() {
        return buttonYes;
    }

    public SelenideElement getOrderConfirmedText() {
        return orderConfirmedText;
    }
}
