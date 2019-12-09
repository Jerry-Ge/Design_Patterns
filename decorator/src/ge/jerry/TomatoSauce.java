package ge.jerry;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Sauce");
    }


    public String getDescription()
    {
        return tempPizza.getDescription() + ", Tomato";

    }


    public double getCost()
    {
        return tempPizza.getCost() + 0.35;

    }
}
