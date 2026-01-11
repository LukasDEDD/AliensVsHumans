public class Humans extends Entities {

    private int sword;
    private int magic;

    public Humans(String name, int damage, int health, int sword, int magic) {
        super(name, damage, health);
        this.sword = sword;
        this.magic = magic;
    }

    public Humans() {
        super("Default", 0, 100);
        this.sword = 0;
        this.magic = 0;
    }

    @Override
    public int getDamage() {
        return sword + magic;
    }


    public int health(int damage) {

        if (damage == 100)
            return 0;
        else if (damage < 100 && damage > 25 ) {
            return 50;
        } else if (damage <= 25) {
            return 75;
        }
        else {
            throw new IllegalArgumentException("Unsupported damage: " + damage);
        }
    }
}











