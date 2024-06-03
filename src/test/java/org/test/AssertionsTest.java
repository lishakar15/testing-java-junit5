package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void assertEqualsTest()
    {
        JavaOperations javaOperationsTest = new JavaOperations();
        int actual = javaOperationsTest.add(5,4);
       Assertions.assertEquals(8,actual);
    }
    @Test
    public void assertNotEqualsTest()
    {
        JavaOperations javaOperationsTest = new JavaOperations();
        int actual = javaOperationsTest.add(5,4);
        Assertions.assertNotEquals(8,actual); //This will check the negative testcase
    }

    @Test
    public void arrayEqual()
    {
        int a [] = {1,2,3};
        int b [] = {1,2,3};
        //Assertions.assertEquals(a,b);// This fails because it compares the array object location
        Assertions.assertArrayEquals(a,b);
    }

    @Test
    public void assertTrueTest()
    {
        String str = "I love Java";
        Assertions.assertTrue(str.startsWith("I"));
    }

    @Test
    public void assertFalseTest() //If condition return true then test case fails
    {
        String str = "You are Awesome!";
        Assertions.assertFalse(str.contains("!"),"Test Assert False failed");
    }

    @Test
    public void multipleAssertions()
    {
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertEquals(9,javaOperations.add(4,4)); //Failing
        Assertions.assertEquals(20,javaOperations.add(15,5));
        Assertions.assertEquals(17,javaOperations.add(7,3)); //Failing
        Assertions.assertEquals(15,javaOperations.add(10,5));
    }

    @Test
    public void groupAssertion()
    {
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertAll(
                ()->Assertions.assertEquals(9,javaOperations.add(4,4)),//Failing
                ()->Assertions.assertEquals(20,javaOperations.add(15,5)),
                ()->Assertions.assertEquals(17,javaOperations.add(7,3)),//Failing
                ()->Assertions.assertEquals(15,javaOperations.add(10,5))
        );
    }

}
