package ge.jerry;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public EnemyShip() {
    }

    public EnemyShip(String name, double amtDamage) {
        this.name = name;
        this.amtDamage = amtDamage;
    }

    public String getName() {
        return name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip()
    {
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip()
    {
        System.out.println(getName() + " is on the screen");
    }
}
