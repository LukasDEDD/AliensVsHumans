
public class Aliens extends Entities {

    private int poison;
    private int bite;



    public Aliens(String name, int damage, int health,  int poison, int bite) {
        super(name, damage, health);
        this.poison = poison;
        this.bite = bite;
    }

    public Aliens() {
        super("Default", 0, 100);
        this.poison = 0;
        this.bite = 0;
    }

    @Override
    public int getDamage() {
        return poison + bite;
    }


    public int health(int damage) {

        if (damage == 100)
            return 0;
        else if (damage < 100 && damage > 25 ) {
            return 70;
        } else if (damage <= 25) {
            return 80;
        }
        else {
            throw new IllegalArgumentException("Unsupported damage: " + damage);
        }
    }

}


