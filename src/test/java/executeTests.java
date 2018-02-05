import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Selectors;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeTests {
    @Test
    public void simpleNavigation() {
            System.setProperty("selenide.browser", "Chrome");
            open("http://www.google.com");
            $("#lst-ib").val("Haim Kushmar");
            $(By.name("btnK")).click();
            $(withText("LinkedIn")).click();
            //$("h1").shouldHave(exactText("Haim Kushmar"));
     }

    @Test
    public void simpleWawanesa() {
        System.setProperty("selenide.browser", "Chrome");
        open("http://www.wawanesa.com");
        $(By.id("Country")).selectOption("Wawanesa California");
        $(withText("Manage Your Policy")).click();
        //$(withText("Billing Inquiry")).click();
        $(byText("Billing Inquiry")).click();
        $("#inputPolicyNum").setValue("123456789");
        $("#inputLastName").setValue("blahblah");
        $("#submitBtn").click();
        $(withText("Sorry, we are unable to locate your policy. Please re-enter your")).shouldBe(exist);
    }

}
