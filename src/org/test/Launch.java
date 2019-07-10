package org.test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.hdfcbank.com/");
driver.manage().window().maximize();

WebElement btnlogin= driver.findElement(By.xpath("//a[@class='homeloginbtn']"));
btnlogin.click();
//par window
String Par = driver.getWindowHandle();
System.out.println(Par);
//child window
Set<String> All = driver.getWindowHandles();
System.out.println(All);
//find the child wind id
for (String v : All) {
if (!Par.equals(v)) {
driver.switchTo().window(v);
}
}
WebElement btnNet = driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]"));
btnNet.click();
driver.quit();
}
}
