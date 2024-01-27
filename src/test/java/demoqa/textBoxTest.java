package demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class textBoxTest {

    @Test
    void fillFormTest (){
        open("https://demoqa.com/text-box");
        $(".main-header").shouldHave(text("Text Box"));
    }
}
