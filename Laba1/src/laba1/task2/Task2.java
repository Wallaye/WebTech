package laba1.task2;

public class Task2 {
    public static void main(String[] args){
        System.out.println(_task2(0, 10));
        System.out.println(_task2(2, 2));
    }
    public static boolean _task2(int x, int y){
        boolean top;
        top = (y > 0 && y <= 4) && (x >= -4 && x <= 4);
        boolean bottom;
        bottom = (y >= -2 && y <= 0) && (x >= -6 && x <= 6);
        return top || bottom;
    }
}
