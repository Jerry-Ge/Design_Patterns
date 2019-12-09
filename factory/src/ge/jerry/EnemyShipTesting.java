package ge.jerry;

import java.util.Scanner;

public class EnemyShipTesting {


    public static void main(String[] args)
    {
        EnemyShipFactory shipFactory = new EnemyShipFactory();


        EnemyShip theEnemyShip = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type ship (U/R/B)");

        if (userInput.hasNextLine())
        {
            String typeOfShip = userInput.nextLine();
            theEnemyShip = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemyShip != null)
        {
            doStuffEnemy(theEnemyShip);
        } else {
            System.out.println("Please try again");
        }

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
    }
}
