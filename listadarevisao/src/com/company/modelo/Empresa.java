package com.company.modelo;
import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private String nomeEmpresa;
    private int cpnj;
    List<Departamento> departamentos = new ArrayList<>();

    public Empresa(String nomeEmpresa, int cpnj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cpnj = cpnj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getCpnj() {
        return cpnj;
    }

    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepto(Departamento depto){
        departamentos.add(depto);
    }

    public void removeDepto(Departamento depto){
        departamentos.remove(depto);
    }


}
