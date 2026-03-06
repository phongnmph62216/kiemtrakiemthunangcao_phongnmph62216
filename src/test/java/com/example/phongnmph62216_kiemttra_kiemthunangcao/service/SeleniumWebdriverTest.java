package com.example.phongnmph62216_kiemttra_kiemthunangcao.service;


//Dùng Selenium Webdriver viết đoạn script thực hiện các hành động với trang web sau: https://vitimex.com.vn/
//●	Thực hiện đăng ký tại trang web (1 Điểm)
//●	Đăng nhập lại với tài khoản vừa đăng ký(1 Điểm)


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverTest {

    private static WebDriver driver;

    @BeforeEach
    void setUp() {
         WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    void AceOnlineShoePortal() throws InterruptedException {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();


        driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();


            driver.quit();
    }
}
