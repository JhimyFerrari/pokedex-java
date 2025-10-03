package com.entities;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {
    private int numero;
    private String nome;
    private List<Tipo> tipos;
    private int hp;
    private float peso;
    private int altura;
    private boolean evolui;

    public Pokemon(int numero, String nome, List<Tipo> tipos, int hp, float peso, int altura,
            boolean evolui) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList<>();
        for (Tipo tipo : tipos) {
            this.tipos.add(tipo);
        }
        this.hp = hp;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(List<Tipo> tipos) {
        for (Tipo tipo : tipos) {
            this.tipos.add(tipo);
        }
    }

    public List<Tipo> getTipo() {
        return this.tipos;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isEvolui() {
        return evolui;
    }

    public void setEvolui(boolean evolui) {
        this.evolui = evolui;
    }

    public String getTipoFraquezas() {
        String fraquezas = "";
        for (Tipo tipo : tipos) {
            fraquezas += tipo.getFraquezas() + " ";
        }
        return fraquezas;

    }

    
    public String getTipoResistencias() {
        String resistencias = "";
        for (Tipo tipo : tipos) {
            resistencias += tipo.getResistencias() + " ";
        }
        return resistencias;

    }
}
