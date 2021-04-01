package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask2 {
    @Test
    public void correctArrayAndOrderTest(){
        int[] array = {17, 15, 9, 5, 1};
        int[] result = {17, 16, 11, 8, 5};
        Assert.assertEquals(Task2.transform(array,SortOrder.DESC), result);
    }

    @Test
    public void correctArrayAndOrderNegativeValuesTest(){
        int[] array = {17, 15, 9, -5, -51};
        int[] result = {17, 16, 11, -2, -47};
        Assert.assertEquals(Task2.transform(array,SortOrder.DESC), result);
    }

    @Test
    public void correctArrayIncorrectOrderTest(){
        int[] array = {17, 15, 9, 5, 1};
        Assert.assertEquals(Task2.transform(array,SortOrder.ASC), array);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Cannot pass null or empty params.")
    public void nullArrayTest(){
        Task2.transform(null,SortOrder.ASC);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Cannot pass null or empty params.")
    public void nullOrderTest(){
        int[] array = {17, 15, 9, 5, 1};
        Task2.transform(array,null);
    }
}
