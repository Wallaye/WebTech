package laba1.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        ArrayList<Integer> list = _task4(new int[] {2, 10, 1, 9, 17});
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static ArrayList<Integer> _task4(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (isPrime(arr[i])) list.add(i);
        }
        return list;
    }
    public static boolean isPrime(int x){
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0) return false;
        }
        return true;
    }
}
