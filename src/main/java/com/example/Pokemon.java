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
    
    public String getTipo1() {
        return tipo1;
    }
    
    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }
    
    public String getTipo2() {
        return tipo2;
    }
    
    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
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
}
