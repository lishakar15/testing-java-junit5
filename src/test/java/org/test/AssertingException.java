package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertingException {

    @Test
    public void assertionException()
    {
        Exception ex = Assertions.assertThrows(ArithmeticException.class,()-> {
            int result = 1/0;
        });
        System.out.println(ex.getMessage());
    }

    @Test
    public void assertionChildException()
    {
        Assertions.assertThrows(IndexOutOfBoundsException.class,()-> //Parent Exception
        {
            throw new ArrayIndexOutOfBoundsException(); //Child exception
        });
    }
}
