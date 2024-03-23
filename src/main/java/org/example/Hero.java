package org.example;
//Класс Hero
class Hero {
    private int health;
    private int damage;
    private String superpower;

    //Конструктор с заданием всех полей
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }
    //Конструктор с зажанием только здоровья и урона
    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
        this.superpower = "No superpower";
    }
    //Геттеры для всех полей
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getSuperpower(){
        return superpower;
    }
}

