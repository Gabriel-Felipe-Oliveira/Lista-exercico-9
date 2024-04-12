package com.example.demo.models;

public class Carro {
    private String modelo;
    private String marca;
    private int anoFabricacao;

    public Carro(String novoModelo, String novaMarca, int novoAnoFabricacao) {
        this.modelo = novoModelo;
        this.marca = novaMarca;
        this.anoFabricacao = novoAnoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}