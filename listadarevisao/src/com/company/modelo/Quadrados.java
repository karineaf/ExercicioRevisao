package com.company.modelo;
public class Quadrados extends Quadrilateros{
    double lado;

    public Quadrados(double lado) {
        this.lado = lado;
    }

    public double calculoPerimetro(){
        perimetro = lado*4;
        return perimetro;
    }
}
