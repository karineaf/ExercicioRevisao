package com.company.modelo;
public class Circulo implements FormaGeometrica {
    double raio;
    double perimetro, area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculoPerimetro(){
        perimetro = (2*Math.PI)*this.raio;
        return perimetro;
    }

    public double calculoArea(){
        area = Math.PI*(Math.pow(raio,2));
        return area;
    }

}
