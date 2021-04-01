package com.epam.test.automation.java.practice4;

public class Task4 {
    private Task4(){}

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if(t>=1 || t<=0){
            throw new IllegalArgumentException("Passed step must be in 0 to 1 boundaries.");
        }
        if(alim < 0){
            throw new IllegalArgumentException("Passed limit cannot be < 0.");
        }
        if(a1 <= alim){
            throw new IllegalArgumentException("Passed initial element cannot be <= limit.");
        }

        double result = 0;
        double last = a1;

        while (last > alim && last > 0.00000001){
            result+=last;
            last=last*t;
        }

        return Math.round(result);
    }
}
