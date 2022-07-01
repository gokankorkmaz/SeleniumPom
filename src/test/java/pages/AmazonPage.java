package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {


    WebDriver driver;

    //PAGE sayfası oluşturduğumuzda yapmamız gereken şey
    //bir constructor ( kurucu metot) oluşturup ilk değeri atamaktır.

    public AmazonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public AmazonPage() {

    }

    //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;


    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;



}
