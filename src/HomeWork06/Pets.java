package HomeWork06;

public abstract class Pets {

    public static int petsCount = 0;

    protected String name;
    protected int lengthForRun;
    protected int lengthForSwim;

    public Pets(String name, int lengthForRun, int lengthForSwim) {
        this.name = name;
        this.lengthForRun = lengthForRun;
        this.lengthForSwim = lengthForSwim;
    }

    public abstract void run();

    public abstract void swim();

}
