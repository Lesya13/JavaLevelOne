package lesson06.online;

public class Archer extends Unit {

    public Archer(String name, int heath, int attack, int defence, int power) {
        super(name, heath, attack, defence, power);
    }

    @Override
    public void jump() {
        System.out.println(this.name + " jump");
    }
}
