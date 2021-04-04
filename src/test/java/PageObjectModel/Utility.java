package PageObjectModel;

import Config.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Utility {

    WebDriver driver;
    WebDriverWait wait;
    DriverClass driverClass = new DriverClass();

    public Utility(){
            driver=driverClass.getDriver();
            wait= new WebDriverWait(driver,10);
    }

    public void navigateToWebsite(){

        driver.get("http://demowebshop.tricentis.com/");
    }

    public WebElement StringToWebElement(String whichLocator, String elementLocator){

        WebElement elementToReturn = null;

        if(whichLocator.contains("xpath")){
            By element = By.xpath(elementLocator);
            System.out.println("element locator is " + elementLocator);
            waitForVisible(element);
            elementToReturn= driver.findElement(element);

        }else if(whichLocator.contains("css")){
            By element = By.cssSelector(elementLocator);
            waitForVisible(element);
            elementToReturn= driver.findElement(element);

        }else if(whichLocator.contains("id")){
            By element = By.id(elementLocator);
            waitForVisible(element);
            elementToReturn= driver.findElement(element);

        }else if(whichLocator.contains("class")){
            By element = By.className(elementLocator);
            waitForVisible(element);
            elementToReturn= driver.findElement(element);

        }else if(whichLocator.equalsIgnoreCase("linkText")){
            By element = By.linkText(elementLocator);
//            waitForVisible(element);
            elementToReturn= driver.findElement(element);
        }

        if(elementToReturn==null){
            Assert.assertTrue("Element should not be null",false);
        }

        return  elementToReturn;
    }

    public List<WebElement> StringToMultipleWebElements(String whichLocator, String elementLocator){

        List<WebElement> allElementsToReturn = null;

        if(whichLocator.equalsIgnoreCase("xpath")){
            By element = By.xpath(elementLocator);
            waitForVisible(element);
            allElementsToReturn= driver.findElements(element);

        }else if(whichLocator.equalsIgnoreCase("css")){
            By element = By.cssSelector(elementLocator);
            waitForVisible(element);
            allElementsToReturn= driver.findElements(element);

        }else if(whichLocator.equalsIgnoreCase("id")){
            By element = By.id(elementLocator);
            waitForVisible(element);
            allElementsToReturn= driver.findElements(element);

        }else if(whichLocator.equalsIgnoreCase("class")){
            By element = By.className(elementLocator);
            waitForVisible(element);
            allElementsToReturn= driver.findElements(element);

        }else if(whichLocator.equalsIgnoreCase("linkText")){
            By element = By.linkText(elementLocator);
            waitForVisible(element);
            allElementsToReturn= driver.findElements(element);
        }

        if(allElementsToReturn==null){
            Assert.assertTrue("Element should not be null",false);
        }

        return  allElementsToReturn;
    }


    public WebElement findElementByText(String elementToFindByText){
        By elementToWait =By.xpath("//*[contains(text(),'"+elementToFindByText+"')]");
        waitForVisible(elementToWait);
        return driver.findElement(elementToWait);
    }

    public void waitForVisible(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitForClickable(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void switchToNextWindow(){
        Set<String> pages = driver.getWindowHandles();

        for (String wind:pages) {

            driver.switchTo().window(wind);
        }

    }

    public void closeTheCurrentPage(String whichCommand){
        driver.close();
    }



}
