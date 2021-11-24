package TestCases;

import GUI.MainGui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    static WebDriver obj;


    static void Chrome() {

        try {
            //private WebDriver obj;
            System.setProperty("webdriver.chrome.driver",
                    "C:\\chromedriver.exe");
            obj = new ChromeDriver();
            obj.get("http://demowebshop.tricentis.com");
        } catch (Exception e) {
           MainGui.DialogTest("Browser Fehler","chromedriver.exe soll in 'C:\\' eingefügt werden");
            System.out.println("chromedriver.exe soll in 'C:\\\\' eingefügt werden");
        }

    }
}
