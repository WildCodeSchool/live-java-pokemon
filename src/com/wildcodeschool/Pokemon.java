package com.wildcodeschool;

public abstract class Pokemon {

    // Pokémon : nom, une valeur d'attaque, un nombre de point de vie
    private String name;
    private int attack;
    private int life;

    public Pokemon(String nameValue, int attackValue) {
        this.name = nameValue;
        this.attack = attackValue;
        this.life = 30;
    }

    public Pokemon(String nameValue, int attackValue, int lifeValue) {
        this.name = nameValue;
        this.attack = attackValue;
        this.life = lifeValue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void takeHit(Pokemon opponent) {

        // récupérer les dégâts de l'adversaire
        int damage = opponent.getAttack();
        this.life -= damage;
    }
}
