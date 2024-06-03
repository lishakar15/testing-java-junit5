package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

@Timeout(6) //Class level Timeout 6 secs for all non annotated methods
public class AssertTimeoutTest {

    @Test
    @Timeout(4) //4 secs
    public void testTimeout1() throws InterruptedException {
        Thread.sleep(5000); //5 secs pause
    }
    @Test
    public void testTimeout2() throws InterruptedException {
        Thread.sleep(7000);
    }

    //Using Assertions timeout method
    @Test
    public void testTimeout3()
    {
        Assertions.assertTimeout(Duration.ofMillis(3000),()->
                Thread.sleep(4000) );
    }
    @Test
    public void testTimeout4()
    {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(3000),()->
                Thread.sleep(10000) ); //Its 10 secs but report will fail in 3 secs
    }
}
