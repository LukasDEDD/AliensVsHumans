public class Humans extends Entities {

    private int sword;
    private int magic;



    public Humans(String name, int damage, int skills, int health, int sword, int magic) {
        super(name, damage, skills, health);
        this.name = name;
        this.sword = sword;
        this.magic = magic;
        this.skills = skills;
    }

}

