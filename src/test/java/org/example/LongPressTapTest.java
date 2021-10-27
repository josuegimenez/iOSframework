package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class LongPressTapTest extends BaseiOSTest {
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = DesiredCapabilities();
        MobileElement e = (MobileElement) driver.findElementByName("Long tap");
        IOSTouchAction touch = new IOSTouchAction(driver);
        touch.longPress(longPressOptions().withElement(element(e)).withDuration(Duration.ofSeconds(2))).release().perform();
        MobileElement tap = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSwitch[1]");
        touch.tap(TapOptions.tapOptions().withElement(element(tap))).perform();
    }
}
