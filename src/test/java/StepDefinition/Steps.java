package StepDefinition;

import PageObjectModel.Elements;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class Steps {

    Elements elements = new Elements();


    @Given("^navigate to website$")
    public void naivgate_to_website() {
        elements.navigate();

    }

    @Given("^Enter the following values in the \"([^\"]*)\" page$")
    public void enter_the_following_values_in_the_page(String whichPage, DataTable table) {
        List<List<String>> elementNameAndValue = table.asLists(String.class);

        for(int i = 0 ; i <elementNameAndValue.size();i++){
            System.out.println(elementNameAndValue.get(i));
            elements.enterDataOnTheElement(elementNameAndValue.get(i).get(0) , elementNameAndValue.get(i).get(1) , whichPage);
        }
    }

    @Given("^Click on following button in the \"([^\"]*)\" page$")
    public void click_on_following_button_in_the_page(String whichPage, DataTable table) {
        List<String> elementNameAndValue = table.asList(String.class);
        for(int i = 0 ; i <elementNameAndValue.size();i++){
            System.out.println(elementNameAndValue.get(i));
            elements.clickOnElement(elementNameAndValue.get(i) , whichPage);
        }
    }

    @Then("^Verify following texts in the \"([^\"]*)\" page$")
    public void verifyFollowingTextsInThePage(String elementName , DataTable table) throws Throwable {

        List<String> elementNameAndValue = table.asList(String.class);
        for(int i = 0 ; i <elementNameAndValue.size();i++){
            System.out.println(elementNameAndValue.get(i));
            elements.verifyTextsInThePage(elementNameAndValue.get(i));
        }

    }

    @Then("^Wait for (\\d+) seconds$")
    public void waitForSeconds(int sec) {

        try {
            Thread.sleep(sec *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^Hover over on the following element \"([^\"]*)\" in the \"([^\"]*)\" page$")
    public void hoverOverOnTheFollowingElementInThePage(String elementName, String whichPage) throws Throwable {
        elements.hoverOver(elementName,whichPage);
    }
}
