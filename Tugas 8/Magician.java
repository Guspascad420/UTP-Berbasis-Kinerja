public class Magician extends Character {

    public Magician(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        return (int)(Math.random() * 10) + 1 < 3.6;
    }

    @Override
    public void info() {
        System.out.println("--------------STATUS--------------");
        System.out.println("Role        : Magician");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
