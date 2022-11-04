package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    // локатор кнопки "Заказать"
    @FindBy(xpath = ".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement buttonOrderBig;

    // локатор кнопки "Заказать" в заголовке
    @FindBy(xpath = ".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']")
    private SelenideElement buttonOrderHeader;

    // accordion
    private ElementsCollection questions;

    // answers
    private ElementsCollection answers;

    public MainPage() {
        this.questions = $$(byClassName("accordion__button"));
        this.answers = $$(byClassName("accordion__panel"));
    }

    public SelenideElement getQuestion(int questionNumber) {
        return this.questions.get(questionNumber);
    }

    public SelenideElement getAnswer(int questionNumber) {
        return this.answers.get(questionNumber);
    }

    public SelenideElement getButtonOrderBig() { return this.buttonOrderBig;}

    public SelenideElement getButtonOrderHeader() { return this.buttonOrderHeader;}
}
