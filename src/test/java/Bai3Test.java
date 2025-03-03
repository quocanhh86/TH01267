import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai3Test {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        chromeDriver.get("https://www.vietjetair.com/vi/ve-may-bay/ve-may-bay-di-australia?content=734121996191&device=c&gad_source=1&gclid=Cj0KCQiAoJC-BhCSARIsAPhdfSgWU6hSNtzlGtJsulSfQDMUtiBXkG_ECsd1FzxTXsSZeny3O-ONAc0aAl8DEALw_wcB");
        Thread.sleep(5000);
        WebElement inputKhoiHanh = chromeDriver.findElement(By.xpath("(//select[@id='detail-origin-block-discover-detail'])[1]"));
        inputKhoiHanh.click();
        WebElement chonKhoiHanh = chromeDriver.findElement(By.xpath("(//option[@value='SGN'])[1]"));
        chonKhoiHanh.click();
        WebElement gioKhoiHanh = chromeDriver.findElement(By.xpath("(//select[@id='detail-destination-block-discover-detail'])[1]"));
        gioKhoiHanh.click();
        WebElement inputGioKhoiHanh = chromeDriver.findElement(By.xpath("(//option[@value='BNE'])[1]"));
        inputGioKhoiHanh.click();
        WebElement inputDiemDen = chromeDriver.findElement(By.xpath("(//input[@id='detail-price-block-discover-detail'])[1]"));
        inputDiemDen.sendKeys("60000000");

    }
}
