package laba1.task9;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args){
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(10, Color.BLACK));
        balls.add(new Ball(9, Color.BLUE));
        balls.add(new Ball(5, Color.BLUE));
        balls.add(new Ball(4, Color.YELLOW));
        balls.add(new Ball(3, Color.RED));
        balls.add(new Ball(11, Color.BLUE));

        Basket basket = new Basket(balls);
        System.out.println(basket.getBlueBalls());
        System.out.println(basket.getWeight());
    }
}
