
public class Aliens extends Entities {

    private int poison;
    private int bite;


    public Aliens(String name, int damage, int health, int poison, int bite) {
        super(name, damage, health);
        this.poison = poison;
        this.bite = bite;
    }

    public int getPoison() {
        return poison;
    }

    public int getBite() {
        return bite;
    }

    @Override
    public int getDamage() {
        return poison + bite;
    }

}


