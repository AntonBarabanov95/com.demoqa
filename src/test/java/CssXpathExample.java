import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExample {
    //<input autocomplete="off" placeholder="name@example.com" type="email" id="userEmail" class="mr-sm-2 form-control">



    @Test
    void cssXpathExample() {
        //$("#userEmail").setValue("anton.barabanov95@gmail.com");
        $x("//*[@id=userEmail]").setValue("anton.barabanov95@gmail.com");

        $("[class=mr-sm-2 form-control]").setValue("anton.barabanov95@gmail.com");

        //<div>Hello qa.guru</div> Поиск по тексту
        $x("//div[text()='Hello qa.guru']");
        $(byText("Hello qa.guru"));
        $(withText("Hello qa.guru"));

    }
}
