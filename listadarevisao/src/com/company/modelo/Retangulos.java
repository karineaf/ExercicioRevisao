package com.company.modelo;
public class Retangulos extends Quadrilateros implements FormaGeometrica{
    double base, altura;

    public Retangulos(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calculoPerimetro(){
        perimetro = (base + base ) + (altura + altura);
        return perimetro;
    }



}
