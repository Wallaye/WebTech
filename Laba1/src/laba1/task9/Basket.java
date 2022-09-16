package laba1.task9;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;

    public Basket(ArrayList<Ball> balls){
        this.balls = balls;
    }

    public double getWeight(){
        double result = 0;
        for (Ball ball : balls) {
            result += ball.weight;
        }
        return result;
    }

    public void addBall(Ball ball){
        if (ball != null){
            this.balls.add(ball);
        }
    }

    public int getBlueBalls(){
        int result = 0;
        for (Ball ball : balls){
            if (ball.color == Color.BLUE) result++;
        }
        return result;
    }
}
