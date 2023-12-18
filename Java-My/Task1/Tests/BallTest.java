package Tests;

import Classes.Ball;

public class BallTest {
    public BallTest(){
        System.out.println("Ball test");
        Ball b1 = new Ball();
        Ball b2 = new Ball(2);
        Ball b3 = new Ball(2, 2);

        b1.SetRadius(4);
        b2.SetRadius(4);
        b3.SetRadius(4);

        System.out.println("radius test\n");
        if(!(b1.GetRadius() == b2.GetRadius() && b2.GetRadius() == b3.GetRadius() && b3.GetRadius() == 4)) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("radius test passed\n");

        b1.SetColorId(4);
        b2.SetColorId(4);
        b3.SetColorId(4);

        System.out.println("color test\n");
        if(!(b1.GetColorID() == b2.GetColorID() && b2.GetColorID() == b3.GetColorID() && b3.GetColorID() == 4)) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("color test passed\n");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        System.out.println("all tests passed\n");
    }
}
