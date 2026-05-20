package Desafio_interface;

public class Carro {
    String cod;
    String tipo;
    String modelo;
    String marca;
    String cor;
    String valor;
    String ano;

    Carro(String tipo, String modelo, String marca, String cor, String valor, String ano){
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
        this.ano = ano;
    }
    Carro(){}

    public String getTipo(){
        return tipo;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public String getValor(){
        return valor;
    }
    public String getAno(){
        return ano;
    }
}
