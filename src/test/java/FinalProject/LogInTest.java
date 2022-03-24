package FinalProject;
import Utils.Runner;
import StepObject.LogInSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;

public class LogInTest extends Runner {

    @Test
    public void LogIn() {
        LogInSteps steps = new LogInSteps();
        steps.GoToLogInPage();
        Assert.assertTrue(steps.UserIsOnLogInPage.isDisplayed());
        steps
                .FillLogInEmail(LogInEmailValue)
                .FillLogInPassword(LogInPasswordValue);
        Assert.assertEquals(steps.LogInEmailInput.getValue(), LogInEmailValue);
        Assert.assertEquals(steps.LogInPasswordInput.getValue(), LogInPasswordValue);
        steps.FinishLogIn();
        Assert.assertTrue(steps.UserLogedIn.isDisplayed());
    }

    @Test
    public void LogInErrorTest() {
        LogInSteps steps = new LogInSteps();
        steps.GoToLogInPage();
        Assert.assertTrue(steps.UserIsOnLogInPage.isDisplayed());
        steps
                .FillWrongLogInEmail(WrongEmailValue)
                .FillWrongLogInPassword(WrongPasswordValue)
                .FinishLogin();
        Assert.assertTrue(steps.WrongUserLogedIn.isDisplayed());
    }
}
