package HomeWork06;

public class Dog extends Pets {
    public static int dogCount = 0;

    public Dog(String name, int lengthForRun, int lengthForSwim) {
        super(name, lengthForRun, lengthForSwim);
        ++dogCount;
        ++petsCount;
    }

    @Override
    public void swim() {
        if(lengthForSwim > 10) {
            System.out.println(this.name + " может проплыть только 10 метров!");
        } else {
            System.out.println(this.name + " проплыл " + lengthForSwim + " м.");
        }
    }

    @Override
    public void run() {
        if(lengthForRun > 500) {
            System.out.println(this.name + " может пробежать только 500 м.");
        } else {
            System.out.println(this.name + " пробежал " + lengthForRun + " метров!");
        }
    }
}
