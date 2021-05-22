package lesson06.online;

public class Lesson06 {

    public static void main(String[] args) {
        Paladin paladin = new Paladin("Paladin", 100, 25, 15, 50);
        Archer archer = new Archer("Archer", 75, 50, 2, 75);
        Mage mage = new Mage("Mage", 25, 100, 0, 100);
        Titan titan = new Titan("Titan", 25, 100, 0, 100);

        // Вызов методов, только циклом
        System.out.println("*** Вызов методов циклом ***");
        System.out.println();
        Unit[] army = {paladin, archer, mage, titan};
        for (int i = 0; i < army.length; i++) {
            army[i].speak();
            army[i].getDamage();
            army[i].jump();

            /*
            если текущий элемент масива принадлежит классу Paladin,
            то создаю ссылку, которая будет храниться 100% Paladin
            (приведение к типу Paladin) вызываю по ссылке у объекта
            его личный метод.
             */
            if (army[i] instanceof Paladin) {
                Paladin tmpPaladin = (Paladin) army[i];
                tmpPaladin.defenceSelf();
            }
        }

//        System.out.println();
//        System.out.println("*** Вызов методов более простой ***");
//
//        paladin.speak();
//        paladin.getDamage();
//        paladin.healSelf(15);
//
//        System.out.println("***");
//
//        titan.speak();
//        titan.healSelf(150);
//        titan.jump();
//
//        System.out.println("***");
//
//        archer.speak();
//        archer.getDamage();
//        archer.healSelf(30);
//        archer.jump();
//
//        System.out.println("***");
//
//        mage.speak();
//        mage.getDamage();
//        mage.healSelf(100);
//
//        System.out.println("***");

    }
}
