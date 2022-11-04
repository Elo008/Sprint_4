import Pages.MainPage;
import Pages.OrderPage;
import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class OrderTest {
    private MainPage mainPage;
    private OrderPage orderPage;

    public OrderTest() {
        this.mainPage = open("https://qa-scooter.praktikum-services.ru", MainPage.class);
    }

    @Test
    public void orderHeader() {
        this.mainPage.getButtonOrderHeader().click();
        this.orderPage = page(OrderPage.class);
        this.orderPage.getInputName().setValue("арцуграс");
        this.orderPage.getInputLastName().setValue("ыапкуы");
        this.orderPage.getInputAddress().setValue("ыуваыу");
        this.orderPage.getInputStation().click();
        this.orderPage.getFirstStation().click();
        this.orderPage.getInputPhoneNumber().setValue("65776457654");
        this.orderPage.getButtonFirstStep().click();
        this.orderPage.getInputDate().click();
        this.orderPage.getCurrentDate().click();
        this.orderPage.getInputRentTime().click();
        this.orderPage.getRentTime().click();
        this.orderPage.getInputColor().click();
        this.orderPage.getInputComment().setValue("вапкроненове");
        this.orderPage.getButtonOrder().click();
        this.orderPage.getButtonYes().shouldBe(Condition.visible).click();
        this.orderPage.getOrderConfirmedText().shouldBe(Condition.visible);

    }
}
