package HomeWork06;

import lesson06.online.Paladin;

public class HomeWork06 {
    public static void main(String[] args) {

        Wolf wolf = new Wolf("Акелло", 800, 20);
        Giraffe giraffe = new Giraffe("Лакки", 600, 5);
        Parrot parrot = new Parrot("Рио", 1, 1, 10);

        Cat cat = new Cat("Джеймс", 300, 200);
        Cat cat2 = new Cat("Ирис", 26, 44);
        Cat cat3 = new Cat("Леопольд", 100, 67);
        Dog dog = new Dog("Барс", 100, 30);
        Dog dog2 = new Dog("Дружок", 90, 8);
        Dog dog3 = new Dog("Пушок", 250, 10);
        Dog dog4 = new Dog("Дик", 300, 5);
        Dog dog5 = new Dog("Шай", 50, 3);

        Pets[] myPets = {cat, cat2, cat3, dog, dog2, dog3, dog4, dog5, giraffe, wolf,parrot};
        for (int i = 0; i < myPets.length; i++) {
            myPets[i].swim();
            myPets[i].run();
        }
        parrot.fly();

        System.out.println();
        System.out.println("Всего животных = " + Pets.petsCount + " из них: кошек = " + Cat.catCount + ", а собак = " + Dog.dogCount + ", остальные дикие животные!");
    }
}
