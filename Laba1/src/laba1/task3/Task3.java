package laba1.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<Double>();
        double a = 0;
        double b = 10;
        double h = 1;
        int i = 0;
        list = _task3(a, b, h);
        for (double curr = a; curr <= b; curr += h){
            System.out.format("| %2.4f | %2.6f |\n", curr, list.get(i++));
        }
    }
    public static ArrayList<Double> _task3(double a, double b, double h){
        ArrayList<Double> list = new ArrayList<Double>();
        double curr = a;
        while (curr <= b){
            double temp = curr / Math.PI;
            if (Math.abs(getFrac(temp)) < 0.001) list.add(Double.NaN);
            else list.add(Math.tan(curr));
            curr += h;
        }
        return list;
    }
    public static double getFrac(double x){
        long temp = (long)x;
        return Math.abs(temp - x);
    }
}
