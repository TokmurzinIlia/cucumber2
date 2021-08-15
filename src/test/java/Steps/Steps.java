package steps;

import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps {

    @Допустим("^открыта страница \"([^\"]*)\"$")
    public void openPage(String pageURL) {
        open(pageURL);
        getWebDriver().manage().window().maximize();
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(pageURL, currentPageURL, "Значения ссылок не сопадают");
    }

    @И("^в поле Username введено значение \"([^\"]*)\"$")
    public void enterUsername(String text) {
        $(By.id("user-name")).setValue(text);

        // для демонстрации работы теста
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @И("^в поле Password введено значение \"([^\"]*)\"$")
    public void enterPassword(String text) {
        $(By.id("password")).setValue(text);

        // для демонстрации работы теста
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @И("^выполнено нажатие на кнопку \"([^\"]*)\"$")
    public void clickOnButton(String text) {
        $(By.cssSelector("input[value='" + text + "']")).click();

        // для демонстрации работы теста
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^происходит авторизация и переход на страницу покупок \"([^\"]*)\"$")
    public void checkLinkName(String link) {
        Assertions.assertEquals("PRODUCTS", $(".title").getText(), "User is not log in");
        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^выполнено нажатие на ссылку \"([^\"]*)\"$")
    public void clickOnLink(String link) {
        $(By.xpath("//*[contains(text(), \"" + link + "\")]")).click();

        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^цена объекта равна \"([^\"]*)\"$")
    public void checkGadgetPrice(String price) {
        String actualPriceInfo = $(By.className("inventory_details_price")).getText();
        assertTrue(actualPriceInfo.contains(price), "Актуальная и ожидаемая цена не совпадают");

        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


