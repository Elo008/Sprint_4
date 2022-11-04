import Pages.MainPage;
import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class FAQTest {
    private MainPage mainPage;

    public FAQTest() {
        this.mainPage = open("https://qa-scooter.praktikum-services.ru", MainPage.class);
    }

    @Test
    public void question1() {
        this.checkQuestion(0);
    }

    @Test
    public void question2() {
        this.checkQuestion(1);
    }

    @Test
    public void question3() {
        this.checkQuestion(2);
    }

    @Test
    public void question4() {
        this.checkQuestion(3);
    }

    @Test
    public void question5() {
        this.checkQuestion(4);
    }

    @Test
    public void question6() {
        this.checkQuestion(5);
    }

    @Test
    public void question7() {
        this.checkQuestion(6);
    }

    @Test
    public void question8() {
        this.checkQuestion(7);
    }

    private void checkQuestion(int questionNumber){
        this.mainPage.getQuestion(questionNumber).scrollIntoView(true).click();
        this.mainPage.getAnswer(questionNumber).shouldBe(Condition.visible);
    }
}

