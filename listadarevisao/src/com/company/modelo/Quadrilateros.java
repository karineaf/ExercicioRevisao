package com.company.modelo;
public class Quadrilateros implements FormaGeometrica{

    double lado1,lado2,lado3,lado4;
    double perimetro, area;

    public Quadrilateros(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public Quadrilateros(){}

    public double calculoPerimetro(){
        perimetro = this.lado1 + this.lado2 + this.lado3 + this.lado4;
        return perimetro;
    }

    public double calculoArea(){ return area;}

}
