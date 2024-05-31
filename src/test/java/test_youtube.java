import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Setup;
import youtube_app.Steps_youtube;

import java.net.MalformedURLException;

public class test_youtube {
    private AppiumDriver<MobileElement> driver;
    private Steps_youtube steps_youtube;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        Setup.setupCapabilities();
        driver = Setup.getDriver();
        steps_youtube = new Steps_youtube(driver);
    }

//    @Test
//        public void test(){
//        steps_youtube.clickSearch();
//        steps_youtube.enterSearchText("natia");
//
//        }
//
//    @Test
//    public void test2(){
//        steps_youtube.clickSearch();
//        steps_youtube.enterSearchText("levansd");
//
//    }

    @Test
    public void test3(){
        steps_youtube.clickSearch();
        steps_youtube.enterSearchText("imagine dragons");
        steps_youtube.loadSearch_result();
    }

     @Test
     public void test4() throws InterruptedException {
        steps_youtube.clickSearch();
        steps_youtube.enterSearchText("          ");
        steps_youtube.clickSearch();
        wait(3000);

     }

    @AfterClass
    public void tearDown() {
        Setup.tearDown();
    }
}
