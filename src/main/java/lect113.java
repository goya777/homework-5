import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class lect113 {
    @Test
    public void menutest() throws InterruptedException {

        open("https://dev.menulab.io/");
        $(By.className("ml-button-standart"), 1).click();
        $(By.className("bundle__choose-package"), 0).click();
        $(By.id("field__first-name")).setValue("nata").pressTab();
        $(By.id("field__surname")).setValue("nata").pressTab();
        $(By.id("field__email")).setValue("nata1@test.com").pressTab();
        $(By.id("field__company-user-phone")).setValue("599858520").pressTab();
        $(By.className("select2-search__field")).setValue("georgia").pressEnter();
        $(By.id("field__password")).setValue("Testi123").pressTab();
        $(By.id("field__repeat-password")).setValue("Testi123").pressTab();
        $(By.id("field__agree-terms")).click();
        $(By.className("ml-button"), 5).click();
        $(By.id("field__company-name")).setValue("Testoo").pressTab();
        $(By.id("field__company-visit-page-domain")).setValue("GoldenSunds").pressTab();
        $(By.id("field__company-email")).setValue("nata1@test.com").pressTab();
        $(By.id("field__country")).click();

    }
}