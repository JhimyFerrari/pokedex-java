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

                seederTipos();
                seederPokemons();
        }

        @Override
        public String toString() {
                String listaPokemons = listPokemonsByNome();
                return "Pokemons na base de dados : [\n" + listaPokemons + "]";
        }

        // seeders
        private void seederPokemons() {

                this.pokemons.add(new Pokemon(546, "Cottonee", montaListTiposByIndices(13, 5), 50, 0.6f, 30, true));
                // Adrian Kauan Aquino de Melo
                this.pokemons.add(new Pokemon(572, "Minccino", montaListTiposByIndices(11), 50, 5, 4, true));
                // Ana Louise Lima Silva
                this.pokemons.add(new Pokemon(103, "Exeggutor", montaListTiposByIndices(13, 14), 140, 120, 200, true));
                // Ana Paula de O. de Freitas
                this.pokemons.add(new Pokemon(696, "Clauncher", montaListTiposByIndices(2), 60, 8, 50, true));
                // André Lucas Silva de Oliveira
                this.pokemons.add(new Pokemon(109, "Koffing", montaListTiposByIndices(17), 40, 1, 6, true));
                // Bruno Garcia Souza
                this.pokemons.add(new Pokemon(194, "Wooper", montaListTiposByIndices(2, 16), 55, 8.5f, 40, true));
                // Bruno Monteiro
                this.pokemons.add(new Pokemon(215, "Sneasel", montaListTiposByIndices(15, 8), 60, 28, 90, true));
                // Felipe Jazon Lima
                this.pokemons.add(new Pokemon(50, "Diglett", montaListTiposByIndices(16), 40, 0.8f, 20, true));
                // Gabriel Costa
                this.pokemons.add(new Pokemon(86, "Seel", montaListTiposByIndices(2), 80, 90, 110, true));
                // Gabriel Pelizari
                this.pokemons.add(new Pokemon(412, "Burmy", montaListTiposByIndices(9), 40, 3.4f, 20, true));
                // Guilherme Yuiti Rufino Okamoto
                this.pokemons.add(new Pokemon(193, "Yanma", montaListTiposByIndices(9, 18), 70, 38.0f, 120, true));
                // Jhimy Kenedy S. Ferrari
                this.pokemons.add(new Pokemon(599, "Klink", montaListTiposByIndices(1), 60, 21f, 30, true));
                // João Felipe do Nascimento Lopes
                this.pokemons.add(new Pokemon(39, "Jigglypuff", montaListTiposByIndices(11, 5), 70, 5.5f, 50, true));
                // João Victor Codato
                this.pokemons.add(new Pokemon(515, "Panpour", montaListTiposByIndices(2), 60, 13, 60, false));
                // Lívia Maria dos Santos
                this.pokemons.add(new Pokemon(636, "Larvesta", montaListTiposByIndices(9, 7), 70, 28f, 110, true));
                // Luiz Gustavo Cardoso
                this.pokemons.add(new Pokemon(77, "Ponyta", montaListTiposByIndices(7), 60, 30, 1, true));
                // Maria Eduarda Buchweitz Trovilho
                this.pokemons.add(new Pokemon(391, "Monferno", montaListTiposByIndices(7, 10), 64, 22.0f, 90, true));
                // Matheus Pereira Garcia
                this.pokemons.add(new Pokemon(21, "Spearow", montaListTiposByIndices(11, 18), 60, 2, 30, true));
                // Murilo Augusto
                this.pokemons.add(new Pokemon(53, "Persian", montaListTiposByIndices(11), 90, 32, 100, false));
                // Orlando Cabrera
                this.pokemons.add(new Pokemon(179, "Mareep", montaListTiposByIndices(4), 60, 7.8f, 60, true));
                // Renan Pacheco Cavalcanti
                this.pokemons.add(new Pokemon(712, "Bergmite", montaListTiposByIndices(8), 70, 99.5f, 1, true));
                // Ryan Rigoto
                this.pokemons.add(new Pokemon(226, "Mantine", montaListTiposByIndices(2, 18), 85, 220f, 210, false));
                // WILLIAN WITTIENZO
                this.pokemons.add(new Pokemon(25, "Pikachu", montaListTiposByIndices(4), 35, 6.0f, 40, true));
                // Pedro Baleroni
        }

        private void seederTipos() {
                this.addTipos();
                this.addAtributosEmTipos();

        }

        // subFunctionsSeederTipos
        private void addTipos() {
                this.tipos.add(new Tipo(1, "aco"));
                this.tipos.add(new Tipo(2, "agua"));
                this.tipos.add(new Tipo(3, "dragao"));
                this.tipos.add(new Tipo(4, "eletrico"));
                this.tipos.add(new Tipo(5, "fada"));
                this.tipos.add(new Tipo(6, "fantasma"));
                this.tipos.add(new Tipo(7, "fogo"));
                this.tipos.add(new Tipo(8, "gelo"));
                this.tipos.add(new Tipo(9, "inseto"));
                this.tipos.add(new Tipo(10, "lutador"));
                this.tipos.add(new Tipo(11, "normal"));
                this.tipos.add(new Tipo(12, "pedra"));
                this.tipos.add(new Tipo(13, "planta"));
                this.tipos.add(new Tipo(14, "psiquico"));
                this.tipos.add(new Tipo(15, "sombrio"));
                this.tipos.add(new Tipo(16, "terrestre"));
                this.tipos.add(new Tipo(17, "venenoso"));
                this.tipos.add(new Tipo(18, "voador"));

        }

        private void addAtributosEmTipos() {

                // 1 - Aço
                buscaTipoByIndice(1).setFraquezas(montaListTiposByIndices(2, 4, 7));
                buscaTipoByIndice(1).setResistencias(montaListTiposByIndices(1, 6, 8, 9, 12, 13, 17));

                // 2 - Água
                buscaTipoByIndice(2).setFraquezas(montaListTiposByIndices(7, 13, 16));
                buscaTipoByIndice(2).setResistencias(montaListTiposByIndices(2, 4, 7, 13));

                // 3 - Dragão
                buscaTipoByIndice(3).setFraquezas(montaListTiposByIndices(3, 5, 8));
                buscaTipoByIndice(3).setResistencias(montaListTiposByIndices(2, 3, 4, 7, 8, 13));

                // 4 - Elétrico
                buscaTipoByIndice(4).setFraquezas(montaListTiposByIndices(8, 16));
                buscaTipoByIndice(4).setResistencias(montaListTiposByIndices(4, 2, 13, 17));

                // 5 - Fada
                buscaTipoByIndice(5).setFraquezas(montaListTiposByIndices(1, 7, 17));
                buscaTipoByIndice(5).setResistencias(montaListTiposByIndices(5, 6, 7, 13, 14));

                // 6 - Fantasma
                buscaTipoByIndice(6).setFraquezas(montaListTiposByIndices(6, 14, 15));
                buscaTipoByIndice(6).setResistencias(montaListTiposByIndices(2, 6, 13, 17));

                // 7 - Fogo
                buscaTipoByIndice(7).setFraquezas(montaListTiposByIndices(2, 8, 12, 16));
                buscaTipoByIndice(7).setResistencias(montaListTiposByIndices(7, 1, 4, 6, 9, 13, 17));

                // 8 - Gelo
                buscaTipoByIndice(8).setFraquezas(montaListTiposByIndices(1, 7, 10, 12));
                buscaTipoByIndice(8).setResistencias(montaListTiposByIndices(8));

                // 9 - Inseto
                buscaTipoByIndice(9).setFraquezas(montaListTiposByIndices(7, 8, 10, 12));
                buscaTipoByIndice(9).setResistencias(montaListTiposByIndices(9, 13, 17));

                // 10 - Lutador
                buscaTipoByIndice(10).setFraquezas(montaListTiposByIndices(6, 13, 14, 15));
                buscaTipoByIndice(10).setResistencias(montaListTiposByIndices(10, 12, 16));

                // 11 - Normal
                buscaTipoByIndice(11).setFraquezas(montaListTiposByIndices(10));
                buscaTipoByIndice(11).setResistencias(montaListTiposByIndices(0)); // Nenhuma resistência

                // 12 - Pedra
                buscaTipoByIndice(12).setFraquezas(montaListTiposByIndices(2, 10, 13, 16, 17));
                buscaTipoByIndice(12).setResistencias(montaListTiposByIndices(1, 7, 8, 9));

                // 13 - Planta
                buscaTipoByIndice(13).setFraquezas(montaListTiposByIndices(7, 8, 9, 12, 17));
                buscaTipoByIndice(13).setResistencias(montaListTiposByIndices(2, 4, 13));

                // 14 - Psíquico
                buscaTipoByIndice(14).setFraquezas(montaListTiposByIndices(9, 14, 15));
                buscaTipoByIndice(14).setResistencias(montaListTiposByIndices(10, 14));

                // 15 - Sombrio
                buscaTipoByIndice(15).setFraquezas(montaListTiposByIndices(10, 17, 5));
                buscaTipoByIndice(15).setResistencias(montaListTiposByIndices(6, 15));

                // 16 - Terrestre
                buscaTipoByIndice(16).setFraquezas(montaListTiposByIndices(2, 9, 13));
                buscaTipoByIndice(16).setResistencias(montaListTiposByIndices(4, 12, 16, 17));

                // 17 - Venenoso
                buscaTipoByIndice(17).setFraquezas(montaListTiposByIndices(12, 16));
                buscaTipoByIndice(17).setResistencias(montaListTiposByIndices(5, 9, 10, 13, 17));

                // 18 - Voador
                buscaTipoByIndice(18).setFraquezas(montaListTiposByIndices(4, 8, 12));
                buscaTipoByIndice(18).setResistencias(montaListTiposByIndices(7, 9, 13, 10, 16));
        }

        // helperSeeder
        private List<Tipo> montaListTiposByIndices(int... indices) {
                List<Tipo> listaTipos = new ArrayList<>();
                for (int indice : indices) {
                        listaTipos.add(buscaTipoByIndice(indice));
                }
                return listaTipos;

        }

        // helperPublics
        public Tipo buscaTipoByIndice(int indiceTipo) {
                for (Tipo t : tipos) {
                        if (t.getIndice() == indiceTipo)
                                return t;
                }
                return null;
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
