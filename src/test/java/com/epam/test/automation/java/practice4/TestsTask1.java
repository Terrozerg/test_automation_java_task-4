package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask1 {
    @Test
    public void sortedDESCArrayTest(){
        int[] array = {17, 15, 9, 5, -11};
        Assert.assertTrue(Task1.isSorted(array, SortOrder.DESC));
    }

    @Test
    public void sortedASCArrayTest(){
        int[] array = {-11, 3, 5, 8, 11};
        Assert.assertTrue(Task1.isSorted(array, SortOrder.ASC));
    }

    @Test
    public void notSortedArrayTest(){
        int[] array = {9, 15, -91, 5, 1};
        Assert.assertFalse(Task1.isSorted(array, SortOrder.ASC));
        Assert.assertFalse(Task1.isSorted(array, SortOrder.DESC));
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Cannot pass null params.")
    public void nullArrayTest(){
        Task1.isSorted(null,SortOrder.ASC);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Cannot pass null params.")
    public void nullOrderTest(){
        int[] array = {17, 15, 9, 5, -11};
        Task1.isSorted(array,null);
    }
}
