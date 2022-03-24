package FinalProject;
import StepObject.SearchSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SearchData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchTest extends Runner {
    @Test
    public void SearchTest() {
        SearchSteps steps = new SearchSteps();
        steps
                .FillSearchBar(SearchBarValue)
                .SwitchToSearch();
        sleep(5000);
        Assert.assertTrue(steps.UserSwitchedToSearchPage.isDisplayed());
        steps
                .SelectWantedItem()
                .AddItemToChart();
    }
    @Test
    public void SearchErrorTest() {
        SearchSteps steps = new SearchSteps();
        steps
                .FillWrongSearch(WrongSearchValue)
                .SwitchToTheSearch();
        sleep(5000);
        Assert.assertTrue(steps.ItemNotFound.isDisplayed());
    }
}
