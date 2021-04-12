package PageObjectModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Elements extends Utility {

        public String JsonToString(String elementName , String whichPage){
            JSONParser jsonParser  = new JSONParser();

            Object  obj  = null;
            try {
                obj  =  jsonParser.parse(new FileReader("src/test/java/PageObjectModel/myElements.json"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

            JSONObject json = (JSONObject) obj;

            Object ObjectElement = json.get(whichPage);

            JSONObject jsonObjectElement = (JSONObject) ObjectElement;

            return (String) jsonObjectElement.get(elementName);
        }

        public void clickOnElement(String elementName , String whichPage){

            String locatorTypeAndLocator= JsonToString(elementName , whichPage);

            int i1 = locatorTypeAndLocator.indexOf(" ");
            WebElement element = StringToWebElement(locatorTypeAndLocator.substring(0,i1) , locatorTypeAndLocator.substring(i1));

            element.click();

        }

    public void enterDataOnTheElement(String elementName ,String value , String whichPage){

        String locatorTypeAndLocator= JsonToString(elementName , whichPage);

        int i1 = locatorTypeAndLocator.indexOf(" ");
        System.out.println(locatorTypeAndLocator.substring(0,i1));
        System.out.println( locatorTypeAndLocator.substring(i1));
        WebElement element = StringToWebElement(locatorTypeAndLocator.substring(0,i1).trim() , locatorTypeAndLocator.substring(i1).trim());

        element.sendKeys(value);
    }

    public void verifyTextsInThePage(String elementName ){

        WebElement element = findElementByText(elementName);

        Assert.assertTrue("Element should be displayed but it is not displaying " + elementName ,element.isDisplayed() );
    }

    public void navigate(){
        navigateToWebsite();

    }

    public void hoverOver(String elementName , String whichPage){

        String locatorTypeAndLocator= JsonToString(elementName , whichPage);

        int i1 = locatorTypeAndLocator.indexOf(" ");

        WebElement element = StringToWebElement(locatorTypeAndLocator.substring(0,i1).trim() , locatorTypeAndLocator.substring(i1).trim());

        Actions action = new Actions(driver);

        action.moveToElement(element).perform();
        }

}
