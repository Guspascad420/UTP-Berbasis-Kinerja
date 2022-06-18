public abstract class Character {

    private int defense;
    private int attack;
    private int HP;

    public Character(int defense, int attack, int HP) {
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public abstract boolean attack();
    public void receiveDamage(int damage) {
        if (damage > defense) {
            int attack = damage - this.getDefense();
            this.HP -= attack;
            if (this.HP < 0) {
                this.setHP(0);
            }
        }
    }

    public abstract void info();

    public int getDefense() {
        return defense;
    }

    public int getHP() {
        return HP;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}


