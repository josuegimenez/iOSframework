package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {
    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
        File appDir= new File("src");
        File app=new File(appDir,"ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();

//        cap.setCapability("chromedriverExecutable","/Users/jgimenez/JOSU/appium/src/chromedriver2");
//        System.setProperty("webdriver.chrome.driver", "/Users/jgimenez/JOSU/appium/src/chromedriver2");
        if(device.equals("emulator"))
        {cap.setCapability(MobileCapabilityType.DEVICE_NAME, "JosuEmulator");}
        else if (device.equals("real"))
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashActivity");
        //UI automator
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,10);

        AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }

}
