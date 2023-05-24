package li.linas.pom.pages;

import li.linas.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnPrekiuGrupeRites(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).click().build().perform();
    }

    public static void clickOnRitesSpiningavimui(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).click().build().perform();
    }

    public static void clickOnManoPaskyraByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).click().build().perform();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickOnManoPaskyraPrisijungtiByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).click().build().perform();
    }

    public static void sendKeysToElement(By locator, String sendKeys) {
        getElement(locator).sendKeys(sendKeys);
    }

    public static void clickOnManoPaskyraPrisijungtiButtonByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).click().build().perform();
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static List<String> getTextFromElements(By locator) {

        List<String> listOfElementsText = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            element.getText();
            listOfElementsText.add(element.getText());
        }
        return listOfElementsText;
    }

    public static void cleanTextBoxElement(By locator) {
        Driver.getDriver().findElement(locator).clear();
    }
}
