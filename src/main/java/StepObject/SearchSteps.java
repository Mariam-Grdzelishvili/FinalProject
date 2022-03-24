package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class SearchSteps extends SearchPage {
    public SearchSteps FillSearchBar(String SearchBarValue) {
        SearchBarInput.setValue(SearchBarValue);
        return this;
    }
    public SearchSteps SwitchToSearch() {
        SearchButton.click();
        return this;
    }
    public SearchSteps SelectWantedItem() {
        WantedItem.click();
        return this;
    }
    public SearchSteps AddItemToChart() {
        AddToChart.scrollIntoView(true);
        AddToChart.click();
        return this;
    }
    public SearchSteps FillWrongSearch(String WrongSearchValue) {
        SearchBarInput.setValue(WrongSearchValue);
        return this;
    }
    public SearchSteps SwitchToTheSearch() {
        SearchButton.click();
        return this;
    }
    public SearchSteps NoSuchItem() {
        ItemNotFound.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
}
