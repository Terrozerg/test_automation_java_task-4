package com.epam.test.automation.java.practice4;

public class Task2 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if(array == null || order == null){
            throw new IllegalArgumentException("Cannot pass null params.");
        }

        if(Task1.isSorted(array,order)){
            for (int i = 0; i < array.length; i++) {
                array[i]+=i;
            }
        }

        return array;
    }
}
