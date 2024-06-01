package org.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import javax.print.attribute.standard.MediaSize;

public class EnvironmentalVariableBasedAnnotation {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "LISHAKAR")
    public void matchUserName()
    {
        System.out.println("User name matched");
    }
    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "LISHAKAR")
    public void matchUserNameDisabled()
    {
        System.out.println("User name match disabled");
    }
}
