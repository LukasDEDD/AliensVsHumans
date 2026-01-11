public class Aliens extends Entities {

    private int poison;
    private int bite;



    public Aliens(String name, int damage, int skills, int health,  int poison, int bite) {
        super(name, damage, skills, health);
        this.name = name;
        this.poison = poison;
        this.bite = bite;
        this.skills = skills;
    }
}


