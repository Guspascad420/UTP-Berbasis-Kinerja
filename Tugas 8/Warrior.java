public class Warrior extends Character {

    public Warrior(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        return (int)(Math.random() * 10) + 1 < 7;
    }

    @Override
    public void info() {
        System.out.println("--------------STATUS--------------");
        System.out.println("Role        : Warrior");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
