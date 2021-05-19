package lesson06.online;

public class Paladin extends Unit {

    private int level;

    public Paladin(String name, int heath, int attack, int defence, int power) {
        super(name, heath, attack, defence, power);
    }

    public void defenceSelf() {
        System.out.println(this.name + "has block" + this.defence + "points");
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " jump-jump-jump");
    }

}
