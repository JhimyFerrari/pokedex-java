package com.application;

import com.database.database;
import com.entities.Pokemon;

public class Main {
    public static void main(String[] args) {

        database bd = new database();
        System.out.println(bd);

        Pokemon Yanma = bd.buscaPokemonById(193);
        System.out.println(Yanma.getNome());
        System.out.println(Yanma.getTipoFraquezas());
        System.out.println(Yanma.getTipoResistencias());

    }
}