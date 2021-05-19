package lesson06.online;

public class Titan extends Paladin {

    public Titan(String name, int heath, int attack, int defence, int power) {
        super(name, heath, attack, defence, power);
    }

    @Override
    public void healSelf(int value) {
        System.out.println("I dont have any idea - what is Heal-Self");
    }

    @Override
    public void speak() {
        super.speak(); //вызов родительского метода
        System.out.println("Hell from Override method from Titan");
    }

    @Override
    public void jump() {
        System.out.println("Titan is not jump-jump");
    }

}
