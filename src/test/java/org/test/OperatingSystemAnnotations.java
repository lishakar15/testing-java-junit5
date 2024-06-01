package org.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperatingSystemAnnotations {
    @Test
    @EnabledOnOs(OS.MAC)
    public void methodC()
    {
        System.out.println("This is method is for Windows");
    }
    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void methodD()
    {
        System.out.println("This is method D");
    }
}
