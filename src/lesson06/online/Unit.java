package lesson06.online;

public abstract class Unit {

    protected String name;
    protected int heath;
    protected int attack;
    protected int defence;
    protected int power;

    public Unit(String name, int heath, int attack, int defence, int power) {
        this.name = name;
        this.heath = heath;
        this.attack = attack;
        this.defence = defence;
        this.power = power;

    }

    void speak() {
        System.out.println("Hello. My name is " + name + ". My HP=" + heath);
    }

    void getDamage() {
        System.out.println(name + "has attack " + attack * power + "dmg");
    }

    void healSelf(int value) {
        int tmp = value + defence;
        heath += value + tmp;
        System.out.println(name + " heal-self at " + tmp + ". My HP now is " + heath);
    }

    public abstract void jump();

}
