package org.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class JREAnnotations {

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    public void executeJre11()
    {
        System.out.println("This is for JRE 8 version");
    }
    @Test
    @DisabledOnJre(JRE.JAVA_11)
    public void disabledOnJre11()
    {
        System.out.println("This Test is not for JRE11");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    public void executeJRERange()
    {
        System.out.println("This is for JRE version range 8 to 11");
    }
    @Test
    @DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
    public void disableJRERange()
    {
        System.out.println("This Test is not for JRE version range 9 to 11");
    }
}
