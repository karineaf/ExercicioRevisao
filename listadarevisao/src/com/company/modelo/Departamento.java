package com.company.modelo;
import java.util.ArrayList;
import java.util.List;
public class Departamento {
    private String nomeDepartamento;
    private Integer contador = 0;
   List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nomeDepartamento, Integer contador) {
        this.nomeDepartamento = nomeDepartamento;
        this.contador = contador;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public Integer getContador() {
        return contador;
    }
    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFunc(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removeFunc(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void alterarSal(){
        for (int i=0; i < getFuncionarios().size(); i++) {
            double salariofunc = getFuncionarios().get(i).getSalario() +  getFuncionarios().get(i).getSalario()*0.1;
            getFuncionarios().get(i).setSalario(salariofunc);
        }
    }

    public void transFuncionario(Funcionario func, Departamento depto){
        removeFunc(func);
        depto.addFunc(func);
    }


    @Override
    public String toString() {
        return "\n\nDEPARTAMENTO " + nomeDepartamento +
                "\n- Lista de Funcionarios -\n" + funcionarios;
    }
}
