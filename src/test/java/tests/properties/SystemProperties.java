package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProperties {


    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    @Tag("test5")
    void someTest2() {
        String browser = System.getProperty("browser","chrome");
        String ver = System.getProperty("version","100");
        String browserSize = System.getProperty("browserSize","1280x1024");
        System.out.println(browser);
        System.out.println(ver);
        System.out.println(browserSize);
    }


}
