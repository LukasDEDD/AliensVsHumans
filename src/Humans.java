public class Humans extends Entities {

    private int sword;
    private int magic;

    public Humans(String name, int damage, int health, int sword, int magic) {
        super(name, damage, health);
        this.sword = sword;
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    public int getSword() {
        return sword;
    }

    @Override
    public int getDamage() {
        return sword + magic;
        }

    }












