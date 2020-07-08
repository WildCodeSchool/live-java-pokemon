package com.wildcodeschool;

public class PokemonElec extends Pokemon {

    public PokemonElec(String nameValue, int attackValue) {
        super(nameValue, attackValue);
    }

    public PokemonElec(String nameValue, int attackValue, int lifeValue) {
        super(nameValue, attackValue, lifeValue);
    }

    @Override
    public void takeHit(Pokemon opponent) {

        if (opponent instanceof PokemonWater) {
            int damage = opponent.getAttack();
            setLife(getLife() - damage / 2);
        } else {
            super.takeHit(opponent);
        }
    }
}
