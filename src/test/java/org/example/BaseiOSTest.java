package org.example;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseiOSTest {
    public static IOSDriver DesiredCapabilities() throws MalformedURLException {
//    public static void main (String[] args) throws MalformedURLException {
        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,"50000");
        cap.setCapability("commandTimeouts", "12000");
//        cap.setCapability(MobileCapabilityType.APP, "/Users/jgimenez/Downloads/UIKitCatalog.app");
        cap.setCapability(MobileCapabilityType.APP, "/Users/jgimenez/Downloads/longtap.app");
        IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }
}
