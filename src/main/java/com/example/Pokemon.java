package com.example;

public class Pokemon {
    private int numero;
    private String nome;
    private String tipo1;
    private String tipo2;
    private int hp;
    private float peso;
    private int altura;
    private boolean evolui;

    
    public Pokemon(int numero, String nome,String tipo1, String tipo2,int hp,float peso, int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2= tipo2;
        this.hp = hp;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
    }

    public  Pokemon(int numero, String nome,String tipo1,int hp,float peso, int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2= null;
        this.hp = hp;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
    }


}
