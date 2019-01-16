import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {
    /**
     * @param args
     */
    public static void main(String[] args) {
// objects and variables instantiation
//        System.setProperty("webdriver.firefox.FirefoxDriver", "/Users/linning/Documents/geckodriver");//FirefoxDriver服务地址
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.baidu.com/");

        //定位输入框元素
        WebElement txtbox = driver.findElement(By.name("wd"));
        //在输入框输入文本
        txtbox.sendKeys("WebDriver");
        //定位按钮元素
        WebElement btn = driver.findElement(By.id("su"));
        //点击按钮
        btn.click();

        //关闭驱动
        driver.close();
    }
}