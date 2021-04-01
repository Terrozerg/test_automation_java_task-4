package com.epam.test.automation.java.practice4;

public class Task1 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if(array == null || order == null){
            throw new IllegalArgumentException("Cannot pass null params.");
        }

        switch (order){
            case ASC: {
                for (int i = 0; i < array.length-1; i++) {
                    if (array[i] > array[i + 1]) {
                        return false;
                    }
                }
                break;
            }
            case DESC: {
                for (int i = 0; i < array.length-1; i++) {
                    if (array[i] < array[i + 1]) {
                        return false;
                    }
                }
                break;
            }
        }

        return true;
    }
}