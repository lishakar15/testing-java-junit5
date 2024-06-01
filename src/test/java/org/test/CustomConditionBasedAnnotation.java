package org.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class CustomConditionBasedAnnotation {

    @Test
    @EnabledIf("checkIfUserValid")
    public void validateUser()
    {
        System.out.println("This user is valid");
    }
    public boolean checkIfUserValid()
    {
        //Some logic to check the user
        return true;
    }
    @Test
    @DisabledIf("checkIfUserValid")
    public void validateUserDisabled()
    {
        System.out.println("This user is valid disabled");
    }
}
