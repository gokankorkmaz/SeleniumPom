package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AmazonPage;
import utilities.TestBase;

public class AmazonTest extends TestBase {


    @Test
    public void PomTest() {
        driver.get("https://www.amazon.com.tr");
        AmazonPage amazonPage=new AmazonPage(driver);
        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);
        System.out.println(amazonPage.sonucYazisiElementi.getText());
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Nutella"));
    }


}
