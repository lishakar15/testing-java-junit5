package org.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTests {
    private int count =0;
    @DisplayName("Repeat Test")
    @RepeatedTest(value = 3,name ="Executing repeat {currentRepetition} of {totalRepetitions}")
    public void testRepeat()
    {
        System.out.println("Repeat test");
    }
}
