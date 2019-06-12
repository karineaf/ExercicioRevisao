package com.company.modelo;
public class Funcionario {

    private String nome;
    private double salario;
    private String dataAdmissao;


    public Funcionario(String nome, double salario, String dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "\n\nNome: " + nome +
                "    -    Salario: " + salario +
                "    -    Data de Admissão: " + dataAdmissao;
    }
}
