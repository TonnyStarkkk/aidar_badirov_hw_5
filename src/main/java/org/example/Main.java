package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра босса и задание свойств
        Boss boss = new Boss();
        boss.setHealth(850);
        boss.setDamage(60);
        boss.setDefenceType("Armor");
        //Вывод информации о боссе
        System.out.println("Boss Information");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defence Type" + boss.getDefenceType());
        //Создание и вывод информации о героях
        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Information");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println("----------");


        }
    }

    //Метод для создания героев
    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(100, 20, "Physical");
        heroes[1] = new Hero(80, 30);
        heroes[2] = new Hero(120, 25, "Magical");
        return heroes;
    }
}

