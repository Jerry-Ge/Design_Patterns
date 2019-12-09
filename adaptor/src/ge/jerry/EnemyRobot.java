package ge.jerry;

import java.util.Random;

/* This is Adaptee */
public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands()
    {
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hands");
    }

    public void walkForward()
    {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName)
    {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
