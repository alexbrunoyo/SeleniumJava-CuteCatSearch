/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;/**
 *
 * @author Raposer
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "A:\\Multimidia\\SeleniumTest-CuteCatSearch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.deviantart.com/");
        
        WebElement searchBox = driver.findElement(By.id("search-input"));
        searchBox.sendKeys("cute cat");
        
        WebElement searchButton = driver.findElement(By.className("_29oAF"));
        searchButton.click();
    }
    
}
