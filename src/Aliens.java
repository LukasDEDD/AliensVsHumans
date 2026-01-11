public class Aliens extends Entity {

    private String name;
    private int poison;
    private int bite;

    public Aliens(int damage, int skills, int health, int armour, int poison, String name, int bite) {
        super(damage, skills, health, armour);
        this.poison = poison;
        this.name = name;
        this.bite = bite;
    }
}

