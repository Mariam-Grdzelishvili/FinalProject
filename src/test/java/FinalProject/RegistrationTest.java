package FinalProject;
import Utils.Runner;
import StepObject.RegistrationSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.RegistrationData.*;

public class RegistrationTest extends Runner {

    @Test
    public void Registration() {
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        steps
                .FillFirstName(FirstNameValue)
                .FillLastName(LastNameValue)
                .FillEmail(EmailValue)
                .FillPassword(PasswordValue)
                .FillConfirmPassword(ConfirmPasswordValue);
        Assert.assertEquals(steps.FirstNameInput.getValue(), FirstNameValue);
        Assert.assertEquals(steps.LastNameInput.getValue(), LastNameValue);
        Assert.assertEquals(steps.EmailInput.getValue(), EmailValue);
        Assert.assertEquals(steps.PasswordInput.getValue(), PasswordValue);
        Assert.assertEquals(steps.ConfirmPasswordInput.getValue(), ConfirmPasswordValue);
        Assert.assertTrue(steps.RegistrationBtn.isEnabled());
        steps.FinishRegistration();
    }

    @Test
    public void RegistrationErrorTest() {
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        steps
                .FillWrongFirstName(WrongNameValue)
                .FillWrongLastName(WrongSurnameValue)
                .FillWrongEmail(WrongEmailValue)
                .FillWrongPassword(WrongPasswordValue)
                .FillWrongConfPassword(WrongConfPasswordValue);
        Assert.assertTrue(steps.WrongNameOutput.isDisplayed());
        Assert.assertTrue(steps.WrongSurnameOutput.isDisplayed());
        Assert.assertTrue(steps.WrongEmailOutput.isDisplayed());
        Assert.assertTrue(steps.WrongPasswordOutput.isDisplayed());
        Assert.assertTrue(steps.WrongConfPasswordOutput.isDisplayed());
    }
}
