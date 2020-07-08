package com.wildcodeschool;

public class PokemonWater extends Pokemon {

    public PokemonWater(String nameValue, int attackValue) {
        super(nameValue, attackValue);
    }

    public PokemonWater(String nameValue, int attackValue, int lifeValue) {
        super(nameValue, attackValue, lifeValue);
    }

    @Override
    public void takeHit(Pokemon opponent) {

        if (opponent instanceof PokemonElec) {
            int damage = opponent.getAttack();
            setLife(getLife() - damage * 2);
        } else {
            super.takeHit(opponent);
        }
    }
}
