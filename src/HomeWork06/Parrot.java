package HomeWork06;

public class Parrot extends Pets {

    private int speed;

    public Parrot(String name, int lengthForRun, int lengthForSwim, int speed) {
        super(name, lengthForRun, lengthForSwim);
        this.speed = 20;
        ++petsCount;
    }


    public void fly() {
        System.out.println(this.name + " летает со скоростью " + speed + " км/ч");
    }

    @Override
    public void run() {
        System.out.println(this.name + " не умеет бегать");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " не уммет плавать");
    }
}
