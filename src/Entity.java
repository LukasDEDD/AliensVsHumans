public class Entity {

    protected  int damage;
    protected  int skills ;
    protected  int health;
    protected  int armour;

    public Entity(int damage, int skills, int health, int armour) {
        this.damage = damage;
        this.skills = skills;
        this.health = health;
        this.armour = armour;
    }

    public Entity() {

    }
}
