package ChromeRuner;

import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.open;

public class Crome {
    @BeforeTest

public void beforetest(){

       open("https://www.google.com/");


    }
}
