package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement
         SearchBarInput = $(byId("search_list")),
         SearchButton = $(".input-group-append"),
         UserSwitchedToSearchPage = $(byText("მობილური ტელეფონი - APPLE - iPhone 13 Pro 128GB Sierra Blue")),
         WantedItem = $(byText("მობილური ტელეფონი - APPLE - iPhone 13 Pro 128GB Sierra Blue")),
         AddToChart = $(byId("add-check")),
         ItemNotFound = $(byText("ვერ მოიძებნა"));
}
