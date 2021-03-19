package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup(){
        Configuration.startMaximized=true;
    }

    @Test
    void successfulFillTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Oksana");
        $("#userEmail").setValue("aaa@ff.com");
        $("#currentAddress").setValue("qqww");
        $("#permanentAddress").setValue("5486");
        $("#submit").click();


    }
}