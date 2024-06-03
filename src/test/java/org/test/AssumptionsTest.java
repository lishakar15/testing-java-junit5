package org.test;

import org.junit.Assume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    public void testAssumption()
    {
        Assumptions.assumeTrue("Car".startsWith("C")); //This returns true
        System.out.println("After one");
        Assumptions.assumeTrue("Car".startsWith("y")); //This returns false so skip
        System.out.println("After two");
        Assumptions.assumeTrue("Car".contains("a")); //Returns true but skipped due to last failure
        System.out.println("After three");
    }

    @Test
    public void checkNotNull()
    {
        Object o = null;
        Assume.assumeNotNull(o); //This test case pass if the object is not null
    }
}
