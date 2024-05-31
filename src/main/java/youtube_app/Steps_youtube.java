package youtube_app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Steps_youtube {
    private AppiumDriver<MobileElement> driver;
    private POM_youtube pom_youtube;

    public Steps_youtube(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.pom_youtube = new POM_youtube(driver);

    }

    public void waitForElementToBeClickable(MobileElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisible(MobileElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickSearch() {
        waitForElementToBeClickable(pom_youtube.getSearch(), 10);
        pom_youtube.getSearch().click();
    }

    public void enterSearchText(String searchText) {
        waitForElementToBeVisible(pom_youtube.getSearchContainer(), 10);
        MobileElement searchContainer = pom_youtube.getSearchContainer();
        searchContainer.sendKeys(searchText);
        driver.hideKeyboard();
    }

    public void loadSearch_result(){
        waitForElementToBeClickable(pom_youtube.search_result() , 10);
        MobileElement search_btn = pom_youtube.search_btnICon();
        search_btn.click();



    }

}
