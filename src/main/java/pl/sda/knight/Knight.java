package pl.sda.knight;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Knight {
    private Weapon weapon;

    public Knight() {
    }

    public Knight(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        System.out.println("Knight is fighting...");
        weapon.use();
    }

    public static void main(String[] args) {
        Weapon weapon = new Sword();
        Knight knight = new Knight(weapon);
        knight.fight();

        Knight knight2 = new Knight(new Axe());
        knight2.fight();

        Knight knight3 = new Knight(new Weapon() {
            @Override
            public void use() {
                System.out.println("Bashing using club");
            }
        });
        knight3.fight();
    }
}
