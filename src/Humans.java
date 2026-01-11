public class Humans extends Entity{

    private String name;
    private int sword;
    private int magic;

    public Humans(int damage, int skills, int health, int armour, String name, int sword, int magic) {
        super(damage, skills, health, armour);
        this.name = name;
        this.sword = sword;
        this.magic = magic;
    }
}

