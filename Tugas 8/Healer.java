public class Healer extends Character {

    public Healer(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        return (Math.random() * 10) + 1 < 8.6;
    }

    public void Heal() {
        this.setHP(getHP() + 25);
    }

    @Override
    public void info() {
        System.out.println("--------------STATUS--------------");
        System.out.println("Role        : Healer");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
