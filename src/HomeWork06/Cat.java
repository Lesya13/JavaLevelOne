package HomeWork06;

public class Cat extends Pets {

    public static int catCount = 0;

    public Cat(String name, int lengthForRun, int lengthForSwim) {
        super(name, lengthForRun, lengthForSwim);
        ++catCount;
        ++petsCount;
    }

    @Override
    public void swim() {
        System.out.println(this.name + " не умеет плавать, только спать!");
    }

    @Override
    public void run() {
        if(lengthForRun > 200) {
            System.out.println(this.name + " может пробежать только 200 метров!");
        } else {
            System.out.println(this.name + " пробежал " + lengthForSwim + " м.");
        }
    }
}
