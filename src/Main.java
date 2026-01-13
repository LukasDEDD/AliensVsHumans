
class Main {

public static  void main ( String[] args) {

    Humans humans = new Humans("John", 200, 150, 150, 100);

    Aliens aliens = new Aliens("xc700", 80, 100, 80, 50);
    battle(humans, aliens);
}

public static void battle(Humans humans, Aliens aliens) {
        humans.takeDamage(aliens);
        aliens.takeDamage(humans);
    }
}



