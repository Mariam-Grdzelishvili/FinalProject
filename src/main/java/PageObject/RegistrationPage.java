package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
         RegistrationButton = $(byText("რეგისტრაცია")),
         FirstNameInput = $(byName("firstName")),
         LastNameInput = $(byName("lastName")),
         UserIsOnRegistrationPage = $(byText("სწრაფი რეგისტრაცია")),
         EmailInput = $(byName("email")),
         PasswordInput = $(byName("password")),
         ConfirmPasswordInput = $(byName("confirmPassword")),
         RegistrationBtn = $(".btn-darkred"),
         FinishRegistrationButton = $(byId("singup")),
         WrongNameOutput = $(byText("სახელი სავალდებულოა")),
         WrongSurnameOutput = $(byText("გვარი სავალდებულოა")),
         WrongEmailOutput = $(byText("ელ. ფოსტა სავალდებულოა")),
         WrongPasswordOutput = $(byText("პაროლი სავალდებულოა.")),
         WrongConfPasswordOutput = $(byText("პაროლის გამეორება სავალდებულოა"));
}
