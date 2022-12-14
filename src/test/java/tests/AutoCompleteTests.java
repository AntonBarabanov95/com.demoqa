package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;


public class AutoCompleteTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillAutoCompleteForm() {
        open("/auto-complete");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#autoCompleteMultipleInput").click();
        $("#autoCompleteMultipleInput").setValue("Red").pressEnter();
        $("#autoCompleteMultipleInput").setValue("Green").pressEnter();

        $(".auto-complete__multi-value__label").shouldHave(text("Red"));

    }

    @Test
    void deleteInput() {
        $(".auto-complete__multi-value__remove").click();
        $(".auto-complete__clear-indicator").click();
    }


}
