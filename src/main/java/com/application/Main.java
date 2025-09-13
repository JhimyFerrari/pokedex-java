package com.application;

import java.util.ArrayList;
import java.util.List;

// import com.database.database;
import com.entities.Pokemon;
import com.entities.Tipo;

public class Main {
    public static void main(String[] args) {

        // database bd = new database();
        // System.out.println(bd);

        // Pokemon Yanma = bd.buscaPokemonById(193);
        // System.out.println(Yanma.getNome());

        // Yanma.setTipo("Dragão", "Mato");
        // System.out.println(Yanma.getTipo());

        // Yanma.setTipo("Bug", "Flying");
        // System.out.println(Yanma.getTipo());

        Tipo fogo = new Tipo(1, "Fogo");
        Tipo agua = new Tipo(2, "Agua");
        Tipo planta = new Tipo(3, "Planta", fogo, agua);
        Tipo eletrico = new Tipo(4, "Eletrico", planta, agua);

        List<Tipo> fraquezas = new ArrayList<>(List.of(agua, eletrico));
        fogo.setFraquezas(fraquezas);
        Pokemon pikachu = new Pokemon(0, "Pikachu", fogo, 90, 90, 80, true);
        System.out.println(pikachu.getFraquezas());

    }
}