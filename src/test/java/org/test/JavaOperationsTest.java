package org.test;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class JavaOperationsTest {
    private JavaOperations javaOperations;

    @BeforeAll
    public static void openDatabaseConnection()
    {
        System.out.println("Open Database Connection");
    }
    @AfterAll
    public static void closeDatabaseConnection()
    {
        System.out.println("Close Database Connection");
    }
    @BeforeEach
    public void init()
    {
        javaOperations = new JavaOperations();
        System.out.println("Init method");
    }
    @AfterEach
    public void destroy()
    {
        javaOperations = null; //Now eligible for Garbage Collection
        System.gc();
        System.out.println("Destroy  method");
    }

    @Test
    public void methodA()
    {
        javaOperations.add(5,6);
        System.out.println("methodA");
    }
    @Test
    public void methodB()
    {
        javaOperations.add(1,9);
        System.out.println("methodB");
    }

}