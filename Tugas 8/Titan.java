public class Titan extends Character {

    public Titan(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        return (int)(Math.random() * 10) + 1 < 5;
    }

    @Override
    public void info() {
        System.out.println("--------------STATUS--------------");
        System.out.println("Role        : Titan");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
