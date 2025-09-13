package com.entities;

public class Pokemon {
    private int numero;
    private String nome;
    private Tipo tipo1;
    private Tipo tipo2;
    private int hp;
    private float peso;
    private int altura;
    private boolean evolui;

    public Pokemon(int numero, String nome, Tipo tipo1, Tipo tipo2, int hp, float peso, int altura,
            boolean evolui) {
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.hp = hp;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
    }

    public Pokemon(int numero, String nome, Tipo tipo1, int hp, float peso, int altura, boolean evolui) {
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = null;
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

    public void setTipo(Tipo tipo1, Tipo tipo2) {
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public Tipo getTipo() {
        return this.tipo1;
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

    public String getFraquezas() {
        String fraquezas = (this.tipo2 == null) ? this.tipo1.getFraquezas()
                : this.tipo1.getFraquezas() + this.tipo2.getFraquezas();
        return fraquezas;

    }

    public String getResistencias() {
        String resistencias = (this.tipo2 == null) ? this.tipo1.getResistencias()
                : this.tipo1.getResistencias() + this.tipo2.getResistencias();
        return resistencias;

    }
}
