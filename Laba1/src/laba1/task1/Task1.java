package laba1.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(_task1(10, 10));
    }
    public static double _task1(double x, double y){
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / Math.abs(x - (2 * x / (1 + x * x * y * y))));
        return numerator / denominator + x;
    }
}

