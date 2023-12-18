package Tests; 

import Class.Hand;
import Class.Head;
import Class.Leg;
import Class.Human;

public class HumanTest {
    public HumanTest(){
        Head head = new Head();
        Leg leg = new Leg();
        Hand hand = new Hand();
        Human human = new Human(head, leg, hand);

        System.out.println(human);

        System.out.println("Голова создана");
        System.out.println("Голова тест прошла");

        System.out.println("Нога создана");
        System.out.println("Нога тест прошла");

        System.out.println("Рука создана");
        System.out.println("Рука тест прошла");
    }
}
