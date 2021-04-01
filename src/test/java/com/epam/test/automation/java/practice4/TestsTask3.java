package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("ResultOfMethodCallIgnored")
public final class TestsTask3 {

    @Test
    public void positiveNumbersTest(){
        Assert.assertEquals(Task3.multiArithmeticElements(5,3,4),6160);
    }

    @Test
    public void negativeInitElemTest(){
        Assert.assertEquals(Task3.multiArithmeticElements(-5,3,4),40);
    }

    @Test
    public void negativeStepTest(){
        Assert.assertEquals(Task3.multiArithmeticElements(15,-3,4),9720);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Cannot pass 0 or less elem numbers.")
    public void negativeNumberOfElementsTest(){
        Task3.multiArithmeticElements(15,3,-4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Cannot pass 0 or less elem numbers.")
    public void zeroNumberOfElementsTest(){
        Task3.multiArithmeticElements(15,3,0);
    }
}
