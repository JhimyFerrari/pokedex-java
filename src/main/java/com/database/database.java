package com.database;

import java.util.ArrayList;
import java.util.List;

import com.entities.Pokemon;
import com.entities.Tipo;

public class database {
    // Model Pokemon

    private List<Pokemon> pokemons;
    private List<Tipo> tipos;

    public database() {
        this.pokemons = new ArrayList<>();
        this.tipos = new ArrayList<>();
        seederPokemons();
    }

    @Override
    public String toString() {
        String listaPokemons = listPokemonsByNome();
        return "Pokemons na base de dados : [\n" + listaPokemons + "]";
    }

    // public void seederTipos() {
    // Tipo fogo = new Tipo(1, "Fogo");
    // Tipo agua = new Tipo(1, "agua");
    // Tipo planta = new Tipo(1, "planta");

    // this.tipos.add(fogo);
    // this.tipos.add(agua);
    // this.tipos.add(planta);

    // fogo.setFraqueza(2);
    // agua.setFraqueza(3);
    // planta.setFraqueza(1);
    // }

    public void seederPokemons() {
        // this.pokemons.add(new Pokemon(546, "Cottonee", "Planta", "Fada", 50, 0.6f,
        // 30, true)); // Adrian Kauan Aquino de
        // // Melo
        // this.pokemons.add(new Pokemon(572, "Minccino", "Normal", 50, 5, 4, true));//
        // Ana Louise Lima Silva
        // this.pokemons.add(new Pokemon(103, "Exeggutor", "Planta", 140, 120, 200,
        // true));// Ana Paula de O. de Freitas
        // this.pokemons.add(new Pokemon(696, "Clauncher", "Aquático", 60, 8, 50,
        // true));// André Lucas Silva de Oliveira
        // this.pokemons.add(new Pokemon(109, "koffing", "poison", null, 40, 1, 6,
        // true));// Bruno Garcia Souza
        // this.pokemons.add(new Pokemon(194, "Wooper", "Água", "Ground", 55, 8.5f, 40,
        // true));// Bruno Monteiro
        // this.pokemons.add(new Pokemon(215, "Sneseal", "Dark", 60, 28, 90, true));//
        // Felipe Jazon Lima
        // this.pokemons.add(new Pokemon(50, "Diglett", "Terra", 40, 0.8f, 20, true));//
        // Gabriel Costa
        // this.pokemons.add(new Pokemon(86, "Seel", "Agua", 80, 90, 110, true));//
        // Gabriel Pelizari
        // this.pokemons.add(new Pokemon(412, "Burmy", "Bug", 40, 3.4f, 20, true));//
        // Guilherme Yuiti Rufino Okamoto
        // this.pokemons.add(new Pokemon(193, "Yanma", "Bug", "Flying", 70, 38.0f, 120,
        // true));// Jhimy Kenedy S. Ferrari
        // this.pokemons.add(new Pokemon(599, "Klink", "Aço", 60, 21f, 30, true));//
        // João Felipe do Nascimento Lopes
        // this.pokemons.add(new Pokemon(39, "Jigglypuff", "Normal", "Fada", 70, 5.5f,
        // 50, true));// João Victor Codato
        // // Cuculo
        // this.pokemons.add(new Pokemon(515, "Panpour", "Agua", 60, 13, 60, false));//
        // Lívia Maria dos Santos
        // this.pokemons.add(new Pokemon(636, "Larvesta", "inseto", "fogo", 70, 28f,
        // 110, true));// Luiz Gustavo Cardoso
        // this.pokemons.add(new Pokemon(77, "Ponyta", "Fogo", 60, 30, 1, true));//
        // Maria Eduarda Buchweitz Trovilho
        // this.pokemons.add(new Pokemon(391, "Monferno ", "Fogo", "Lutador", 64, 22.0f,
        // 90, true));// Matheus Pereira
        // // Garcia
        // this.pokemons.add(new Pokemon(21, "Spearow", "Voador", 60, 2, 30, true));//
        // Murilo Augusto
        // this.pokemons.add(new Pokemon(53, "Persian", "Normal", 90, 32, 100,
        // false));// Orlando Cabrera
        // this.pokemons.add(new Pokemon(179, "Mareep", "Eletrico", 60, 7.8f, 60,
        // true));// Renan Pacheco Cavalcanti
        // this.pokemons.add(new Pokemon(712, "Bergmite", "Gelo", 70, 99.5f, 1,
        // true));// Ryan Rigoto
        // this.pokemons.add(new Pokemon(226, "Mantine", "Água", "Voador", 85, 220f,
        // 210, false));// WILLIAN WITTIENZO
        // this.pokemons.add(new Pokemon(25, "Pikachu", "Eletrico", 35, 6.0f, 40,
        // true));// Pedro Baleroni
    }

    public String listPokemonsByNome() {

        String listaPokemons = "";
        for (Pokemon pokemon : pokemons) {
            listaPokemons = listaPokemons + pokemon.getNome() + "\n";
        }
        return listaPokemons;

    }

    public Pokemon buscaPokemonById(int id) {
        for (Pokemon p : pokemons) {
            if (p.getNumero() == id) {
                return p;
            }
        }
        return null;
    }

}
