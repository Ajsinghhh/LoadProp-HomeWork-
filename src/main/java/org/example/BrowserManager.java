package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Class Name
public class BrowserManager extends Utils {

    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();

    //Browser Name
    //String browser = "Chrome";


    //Open Browser method And Type Url
    public void openBrowser() {

        if (loadProp.getProperty("browser").equalsIgnoreCase("Chrome")) {
            System.out.println("Your Browser is Chrome");
            driver = new ChromeDriver();

        } else if (loadProp.getProperty("browser").equalsIgnoreCase("Edge")) {
            System.out.println("Your Browser is Edge");
            driver = new EdgeDriver();

        } else if (loadProp.getProperty("browser").equalsIgnoreCase("FireFox")) {
            System.out.println("Your Browser is FireFox");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Your Browser Name Is Wrong:" + loadProp.getProperty("browser"));
        }

        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://demo.nopcommerce.com/");

        driver.get(loadProp.getProperty("browser"));
        driver.get(loadProp.getProperty("url"));

    }

    //Close Browser Method
    public void closeBrowser() {

        driver.quit();
    }

}
