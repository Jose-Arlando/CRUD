package Desafio_interface;

public class Carro {
    
    String tipo;
    String modelo;
    String marca;
    String ano;
    String valor;
    String cambio;

    Carro(String tipo, String modelo, String marca, String ano, String valor, String cambio){
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cambio = cambio;
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
    public String getCambio(){
        return cambio;
    }
    public String getValor(){
        return valor;
    }
    public String getAno(){
        return ano;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCambio(String cambio){
        this.cambio = cambio;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
}
