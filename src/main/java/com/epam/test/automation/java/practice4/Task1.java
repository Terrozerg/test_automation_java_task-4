package com.epam.test.automation.java.practice4;

public class Task1 {
    private Task1(){}

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if(array == null || array.length == 0 || order == null){
            throw new IllegalArgumentException("Cannot pass null or empty params.");
        }
        boolean condition = true;

        if(order == SortOrder.DESC){
            condition = false;
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1] != condition && array[i] != array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}