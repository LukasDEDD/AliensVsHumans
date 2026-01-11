public class Entities {

    protected String name;
    protected  int damage;
    protected  int health;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public Entities(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;

    }
}
