package snus.bebra.anonimus.two.ball;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball();
        System.out.println(ball);
        ball = new Ball(80, 60);
        System.out.println(ball);
        ball.move(10, 20);
        System.out.println(ball);

    }
}
