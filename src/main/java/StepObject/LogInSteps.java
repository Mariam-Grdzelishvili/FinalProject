package StepObject;

import PageObject.LogInPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class LogInSteps extends LogInPage {
    public LogInSteps GoToLogInPage() {
        LogInButton.click();
        UserIsOnLogInPage.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public LogInSteps FillLogInEmail(String LogInEmailValue) {
        LogInEmailInput.setValue(LogInEmailValue);
        return this;
    }
    public LogInSteps FillLogInPassword (String LogInPasswordValue) {
        LogInPasswordInput.setValue(LogInPasswordValue);
        return this;
    }
    public LogInSteps FinishLogIn() {
        FinishLogInButton.click();
        UserLogedIn.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public LogInSteps FillWrongLogInEmail(String WrongEmailValue) {
        LogInEmailInput.setValue(WrongEmailValue);
        return this;
    }
    public LogInSteps FillWrongLogInPassword(String WrongPasswordValue) {
        LogInPasswordInput.setValue(WrongPasswordValue);
        return this;
    }
    public LogInSteps FinishLogin() {
        FinishLogInButton.click();
        WrongUserLogedIn.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
}
