package PageObjectModel;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elements extends Utility {

        public String LoginPageElement(String whichKey){

            Map<String, String> loginElement = new HashMap<>();

            loginElement.put("Email", "id Email" );
            loginElement.put("Password", "id Password" );
            loginElement.put("LogInButton", "xpath //input[@value='Log in']" );
            loginElement.put("login", "xpath //a[text()='Log in']" );

            return loginElement.get(whichKey);
        }

        public String HomePageElement(String whichKey){

            Map<String, String> loginElement = new HashMap<>();

            loginElement.put("Contact us", "xpath //*[text()='Contact us']" );
            loginElement.put("my account", "xpath //a[text()='My account']" );
            loginElement.put("orders", "xpath //a[text()='Orders']" );
            loginElement.put("Addresses", "xpath //a[text()='Addresses']" );
            loginElement.put("subscribeInput", "xpath //*[@id='newsletter-email']" );
            loginElement.put("subscribeButton", "xpath //*[@id='newsletter-subscribe-button']" );


            return loginElement.get(whichKey);
        }

        public String myAccountPage(String whichKey){

            Map<String, String> loginElement = new HashMap<>();

            loginElement.put("enquiry", "id Enquiry" );
            loginElement.put("submitButton", "xpath //*[@value='Submit']" );


            return loginElement.get(whichKey);
        }


    public void clickOnElement(String elementName , String whichPage){
            String locatorTypeAndLocator = null;
            if(whichPage.equalsIgnoreCase("login")){
                locatorTypeAndLocator = LoginPageElement(elementName);
            }else if(whichPage.equalsIgnoreCase("home")){
                locatorTypeAndLocator = HomePageElement(elementName);
            }else if(whichPage.equalsIgnoreCase("myAccount")){
                locatorTypeAndLocator = myAccountPage(elementName);
            }

            int i1 = locatorTypeAndLocator.indexOf(" ");
            System.out.println(i1);

            WebElement element = StringToWebElement(locatorTypeAndLocator.substring(0,i1) , locatorTypeAndLocator.substring(i1));

            element.click();
        }

    public void enterDataOnTheElement(String elementName ,String value , String whichPage){

        String locatorTypeAndLocator = null;
        if(whichPage.equalsIgnoreCase("login")){
            locatorTypeAndLocator = LoginPageElement(elementName);
        }else if(whichPage.equalsIgnoreCase("home")){
            locatorTypeAndLocator = HomePageElement(elementName);
        }else if(whichPage.equalsIgnoreCase("myAccount")){
            locatorTypeAndLocator = myAccountPage(elementName);
        }

        String[] locatortypeAndLocatorArray = locatorTypeAndLocator.split(" ");

        WebElement element = StringToWebElement(locatortypeAndLocatorArray[0] , locatortypeAndLocatorArray[1]);

        element.sendKeys(value);
    }

    public void verifyTextsInThePage(String elementName ){

        WebElement element = findElementByText(elementName);

        Assert.assertTrue("Element should be displayed but it is not displaying " + elementName ,element.isDisplayed() );
    }

    public void navigate(){
        navigateToWebsite();

    }

}
