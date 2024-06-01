package org.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertyBasedAnnotations {

    @Test
    @EnabledIfSystemProperty(named = "java.specification.version",matches = "11")
    public void getSystemProperty()
    {
        System.out.println("java.specification.version = "+System.getProperty("java.specification.version"));
    }
    @Test
    @DisabledIfSystemProperty(named = "user.country",matches ="IN")
    public void getSystemPropertyCountry()
    {
        System.out.println(System.getProperty("user.country"));

    }

}
