package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {

        open("/text-box");

        $("#userName").setValue("Anton");
        //$("[id=userName]");
        $("#userEmail").setValue("anton.barabanov95@gmail.com");
        $("#currentAddress").setValue("Current Address 1");
        $("#permanentAddress").setValue("Permanent Address 1");
        $("#submit").click();

        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(text("Anton"));
        $("#output #email").shouldHave(text("anton.barabanov95@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Current Address 1"));
        $("#output #permanentAddress").shouldHave(text("Permanent Address 1"));
    }
}
