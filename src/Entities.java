public class Entities {

    protected String name;
    protected  int damage;
    protected int health;
  ;

    public Entities(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;

    }

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}

