package com.company;
import com.company.modelo.*;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        /*Exercício 1
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("informe um número inteiro"));
        JOptionPane.showMessageDialog(null,"Número antecessor: " + (x-1));
        JOptionPane.showMessageDialog(null,"Número sucessor: " + (x+1));*/

        /*Exercício 2
        String a, b, c;
        int  d, e, f;
        a = JOptionPane.showInputDialog("informe o nome da primeira pessoa: ");
        d = Integer.parseInt(JOptionPane.showInputDialog("informe a idade de " + a));

        b = JOptionPane.showInputDialog("informe o nome da segunda pessoa: ");
        e = Integer.parseInt(JOptionPane.showInputDialog("informe a idade de " + b));

        c = JOptionPane.showInputDialog("informe o nome da terceira pessoa: ");
        f = Integer.parseInt(JOptionPane.showInputDialog("informe a idade de " + c));


        if ((d>e) && (d>f)){
            if(e>f){
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + a +
                                                                          "\nPessoa mais nova: " + c);
            }else if (e<f){
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + a +
                                                                           "\nPessoa mais nova: " + b);
            }else{
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + a +
                        "\n" + b + " e " + c + " tem idades iguais");
            }

        }else if((e>d) && (e>f)) {
            if (d > f) {
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + b +
                                                                           "\nPesso mais nova: " + c);
            } else if(d<f) {
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + b +
                                                                          "\nPesso mais nova: " + a);
            }else{
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + b +
                        "\n" + a + " e " + c + " tem idades iguais");
            }
        }else if((f>d) && (f>e)) {
            if (d > e) {
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + c +
                                                                          "\nPesso mais nova: " + b);
            } else if(d<e){
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + c +
                                                                          "\nPesso mais nova: " + a);
            }else{
                JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + c +
                        "\n" + a + " e " + b + " tem idades iguais");
            }
        } else{
            JOptionPane.showMessageDialog(null,"\n" + a + " e " + b + " e " + c + " tem idades iguais");}
        */

        /*Exercício 3
        NumeroDecrescente numero = new NumeroDecrescente();
        numero.ordem(10);*/


        /*Exercicio 4
       //cria o departamento
        Departamento financeiro = new Departamento("FINANCEIRO",1);

        //cria funcionarios
        Funcionario alexandre = new Funcionario("Alexandre", 8200f,"20/10/2018");
        Funcionario kiara = new Funcionario("Kiara", 8500f,"10/08/2018");
        Funcionario jamile = new Funcionario("Jamile", 8300f,"19/10/2018");

        //adiciona os funcionarios ao depto
        financeiro.addFunc(alexandre);
        financeiro.addFunc(kiara);
        financeiro.addFunc(jamile);


        //----------------------------------------------//
        //cria o departamento
        Departamento rh = new Departamento("RH",2);

        //cria funcionarios
        Funcionario tiago = new Funcionario("Tiago", 8400f,"05/11/2018");
        Funcionario gabia = new Funcionario("Gabia", 8100f,"18/12/2018");
        Funcionario thiago = new Funcionario("Thiago", 8210f,"19/01/2019");

        //adiciona os funcionarios ao depto
        rh.addFunc(tiago);
        rh.addFunc(gabia);
        rh.addFunc(thiago);

        //----------------------------------------------//

        Departamento ti = new Departamento("T.I",3);

        Funcionario karine = new Funcionario("Karine", 8300f,"04/12/2017");
        Funcionario amanda = new Funcionario("Amanda", 8100f,"01/12/2017");
        Funcionario natalia = new Funcionario("Natalia", 8210f,"16/07/2017");

        ti.addFunc(karine);
        ti.addFunc(amanda);
        ti.addFunc(natalia);

        //----------------------------------------------//
        //cria empresa
        Empresa lenovo = new Empresa("Lenovo", 113432423);

        //adiciona os deptos a empresa
        lenovo.addDepto(financeiro);
        lenovo.addDepto(rh);
        lenovo.addDepto(ti);

        ti.alterarSal();

        // no parametro fica o funcionario e o depto que ele vai
        ti.transFuncionario(karine, financeiro);
        System.out.println(ti.toString());
        System.out.println(financeiro.toString());
        */


        //Exercício  5
        Quadrados quad1 = new Quadrados(10);
        Retangulos ret1 = new Retangulos(10,2);
        Circulo cir1 = new Circulo(5);

        System.out.println(quad1.calculoPerimetro());
        System.out.println(quad1.calculoArea());






    }
}
