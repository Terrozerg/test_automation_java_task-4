package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask4 {
    @Test
    public void positiveValuesTest(){
        Assert.assertEquals(Task4.sumGeometricElements(4236,0.4,60),6988.0);
        Assert.assertEquals(Task4.sumGeometricElements(100,0.5,20),175);
    }

    @Test
    public void borderValueTest(){
        Assert.assertEquals(Task4.sumGeometricElements(Integer.MAX_VALUE,0.1,60),2.386092917E9);
        Assert.assertEquals(Task4.sumGeometricElements(100,0.5,100),0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Passed initial element cannot be < limit.")
    public void negativeInitElemTest(){
        Task4.sumGeometricElements(-4236,0.4,60);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Passed initial element cannot be < limit.")
    public void initElemLessThenLimitTest(){
        Task4.sumGeometricElements(4236,0.4,606436);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Passed step must be in 0 to 1 boundaries.")
    public void negativeStepTest(){
        Task4.sumGeometricElements(100,-0.5,20);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Passed step must be in 0 to 1 boundaries.")
    public void stepOutOfBoundsTest(){
        Task4.sumGeometricElements(100,64,20);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Passed limit cannot be < 0.")
    public void negativeAlimTest(){
        Task4.sumGeometricElements(100,0.5,-20);
    }
}
