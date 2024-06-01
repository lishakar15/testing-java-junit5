package org.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
MethodOrderer has different way of sorting
DisplayName -> sorts the tests methods alphanumerically based on the
display name of the method

MethodName -> sorts the tests methods alphanumerically based on the
name of the method

OrderAnnotation -> sorts the tests methods alphanumerically based on the
@Order annotation specified with test method

Random -> Executes tests in random order
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ControllingExecutionOrder {
    @Test
    @Order(1)
    public void firstTest()
    {
        System.out.println("First Test Executed");
    }
    @Test
    @Order(2)
    public void secondTest()
    {
        System.out.println("Second Test Executed");
    }
    @Test
    @Order(3)
    public void thirdTest()
    {
        System.out.println("Third Test Executed");
    }
    @Test
    @Order(4)
    public void fourthTest()
    {
        System.out.println("Fourth Test Executed");
    }
}
