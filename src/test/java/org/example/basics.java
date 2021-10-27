package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.example.pageObjects.HomePage;
import org.example.pageObjects.Preferences;

import java.net.MalformedURLException;

public class basics extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities("real");

        HomePage homePage = new HomePage(driver);
        Preferences preferences=new Preferences(driver);

        homePage.Preferences.click();
        preferences.PreferencesDependencies.click();

        preferences.uno.click();
        preferences.dos.click();
        preferences.tres.sendKeys("Hello Justine!");

        preferences.cuatro.get(1).click();


    }
}
