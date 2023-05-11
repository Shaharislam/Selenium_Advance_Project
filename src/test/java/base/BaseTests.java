package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().setSize(new Dimension(375,812));
        System.out.println(driver.getTitle());

        homePage = new HomePage(driver);

        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        inputLink.click();

        List<WebElement> links = driver.findElements(By.tagName("span"));
        System.out.println(links.size());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
