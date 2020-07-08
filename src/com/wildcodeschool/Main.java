package com.wildcodeschool;

public class Main {

    public static void main(String[] args) {

        // Pokémon : nom, une valeur d'attaque, un nombre de point de vie
        Pokemon pikachu = new PokemonElec("Pikachu original", 42, 12);
        Pokemon carapuce = new PokemonWater("Carapuce", 11);

        // Un Pokémon peut attaquer un autre Pokémon
        pikachu.takeHit(carapuce);
        System.out.println(pikachu.getLife());
    }
}
