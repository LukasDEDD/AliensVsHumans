public class Entities {

    protected String name;
    protected  int damage;
    protected  int skills ;
    protected  int health;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getSkills() {
        return skills;
    }

    public int getHealth() {
        return health;
    }

    public Entities(String name, int damage, int skills, int health) {
        this.name = name;
        this.damage = damage;
        this.skills = skills;
        this.health = health;

    }
}
