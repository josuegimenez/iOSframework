package org.example;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.HashMap;

public class SlidersTest extends BaseiOSTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        IOSDriver driver = DesiredCapabilities();
        HashMap<String,Object>scrollObject =new HashMap<>();

        driver.findElementByAccessibilityId("Sliders").click();
        IOSElement slider= (IOSElement) driver.findElementByXPath("//XCUIElementTypeSlider");

        slider.setValue("0");
        slider.setValue("1");
        Assert.assertEquals("100%", slider.getAttribute("value"));
    }
}
