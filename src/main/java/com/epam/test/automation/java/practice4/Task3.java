package com.epam.test.automation.java.practice4;

public class Task3 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if(n <= 0){
            throw new IllegalArgumentException("Cannot pass 0 or less elem numbers.");
        }
        int result = 1;

        for (int i = a1; n > 0; n--, i+=t) {
            result*=i;
        }

        return result;
    }
}
