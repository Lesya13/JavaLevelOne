package HomeWork06;

public class Wolf extends Pets {

    public Wolf(String name, int lengthForRun, int lengthForSwim) {
        super(name, lengthForRun, lengthForSwim);
        ++petsCount;
    }

    @Override
    public void run() {
        System.out.println(this.name + " пробежал " + lengthForRun + " метров!");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " проплыл " + lengthForSwim + " метров!");
    }
}
