package laba1.task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(_task7(10, new double[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1})));
    }
    public static double[] _task7(int n, double[] arr){
        int i, j, step;
        double tmp;
        for (step = n / 2; step > 0; step /= 2){
            for (i = step; i < n; i++){
                tmp = arr[i];
                for (j = i; j >= step; j -= step){
                    if (tmp < arr[j - step]){
                        arr[j] = arr[j - step];
                    } else {
                        break;
                    }
                }
                arr[j] = tmp;
            }
        }
        return arr;
    }
}
