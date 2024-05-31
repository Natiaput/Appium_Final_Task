package youtube_app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class POM_youtube {
    private final AppiumDriver<MobileElement> driver;

    public POM_youtube(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public MobileElement getSearch() {
        return findElement(MobileBy.AccessibilityId("Search YouTube"));
    }

    public MobileElement getSearchContainer() {
        return findElement(By.id("com.google.android.youtube:id/search_edit_text"));
    }
    public MobileElement search_result(){
        return findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.google.android.youtube:id/linearLayout\"])[1]"));
    }

    public MobileElement search_btnICon(){
        return  findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/search_type_icon\"])[1]"));
    }




    private MobileElement findElement(By by) {
        return driver.findElement(by);
    }
}
