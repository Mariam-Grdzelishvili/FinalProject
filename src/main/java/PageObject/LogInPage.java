package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LogInPage {
    public SelenideElement
       LogInButton = $(byText("ავტორიზაცია")),
       UserIsOnLogInPage = $(byText("ავტორიზაცია")),
       LogInEmailInput = $(byName("userName")),
       LogInPasswordInput = $(byName("password")),
       FinishLogInButton = $(byXpath("//*[@id=\"copyHtml1\"]/div/div/div/div/div[1]/form/button")),
       UserLogedIn = $(byText("წარმატებული ავტორიზაცია")),
       WrongUserLogedIn = $(byText("მომხმარებლის სახელი ან პაროლი არასწორია"));

}
