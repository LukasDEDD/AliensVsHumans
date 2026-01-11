public class Aliens extends Entities {

    private int poison;
    private int bite;



    public Aliens(String name, int damage, int health,  int poison, int bite) {
        super(name, damage, health);
        this.poison = poison;
        this.bite = bite;
    }
}


