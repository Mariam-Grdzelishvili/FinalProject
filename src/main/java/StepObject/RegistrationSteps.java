package StepObject;
import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {

    public RegistrationSteps GoToRegistrationPage() {
        RegistrationButton.click();
        UserIsOnRegistrationPage.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public RegistrationSteps FillFirstName(String FirstNameValue) {
        FirstNameInput.setValue(FirstNameValue);
        return this;
    }
    public RegistrationSteps FillLastName(String LastNameValue) {
        LastNameInput.setValue(LastNameValue);
        return this;
    }
    public RegistrationSteps FillEmail(String EmailValue) {
        EmailInput.setValue(EmailValue);
        return this;
    }
    public RegistrationSteps FillPassword(String PasswordValue) {
        PasswordInput.setValue(PasswordValue);
        return this;
    }
    public RegistrationSteps FillConfirmPassword(String ConfirmPasswordValue) {
        ConfirmPasswordInput.setValue(ConfirmPasswordValue);
        return this;
    }
    public RegistrationSteps FinishRegistration() {
        RegistrationBtn.shouldBe(Condition.enabled);
        FinishRegistrationButton.click();
        return this;
    }
    public RegistrationSteps FillWrongFirstName(String WrongNameValue) {
        FirstNameInput.setValue(WrongNameValue);
        WrongNameOutput.shouldBe(Condition.visible, Duration.ofMillis(500));
        return this;
    }
    public RegistrationSteps FillWrongLastName(String WrongSurnameValue) {
        LastNameInput.setValue(WrongSurnameValue);
        WrongSurnameOutput.shouldBe(Condition.visible,Duration.ofMillis(500));
        return this;
    }
    public RegistrationSteps FillWrongEmail(String WrongEmailValue) {
        EmailInput.setValue(WrongEmailValue);
        WrongEmailOutput.shouldBe(Condition.visible,Duration.ofMillis(500));
        return this;
    }
    public RegistrationSteps FillWrongPassword(String WrongPasswordValue) {
        PasswordInput.setValue(WrongPasswordValue);
        WrongPasswordOutput.shouldBe(Condition.visible, Duration.ofMillis(500));
        return this;
    }
    public RegistrationSteps FillWrongConfPassword(String WrongConfPasswordValue) {
        ConfirmPasswordInput.setValue(WrongConfPasswordValue);
        WrongConfPasswordOutput.shouldBe(Condition.visible, Duration.ofMillis(500));
        return this;
    }
}
