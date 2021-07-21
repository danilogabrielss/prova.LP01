package tp05ex01;

import java.util.Scanner;

public class Data {

    Scanner t = new Scanner(System.in);

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        System.out.println("Digite o valor do dia: ");
        this.dia = t.nextInt();
        while (this.dia > 31 || this.dia < 1) {
            System.out.println("Digite o valor do dia: ");
            this.dia = t.nextInt();
        }
        System.out.println("Digite o valor de mes: ");
        this.mes = t.nextInt();
        while (this.mes > 12 || this.mes < 1) {
            System.out.println("Digite o valor do mes: ");
            this.ano = t.nextInt();
        }
        System.out.println("Digite o valor do ano: ");
        this.ano = t.nextInt();
        while (this.ano > 12 || this.ano < 1) {
            System.out.println("Digite o valor do ano: ");
            this.ano = t.nextInt();
        }
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void entraDia(int d) {
        this.dia = d;
    }

    public void entraMes(int d) {
        this.mes = d;
    }

    public void entraAno(int d) {
        this.ano = d;
    }

    public void entraDia() {
        System.out.println("Digite o valor do dia: ");
        this.dia = t.nextInt();
        while (this.dia > 31 || this.dia < 1) {
            System.out.println("Digite o valor do dia: ");
            this.dia = t.nextInt();
        }

    }

    public void entraMes() {
        System.out.println("Digite o valor do mes: ");
        this.mes = t.nextInt();
        while (this.mes > 12 || this.mes < 1) {
            System.out.println("Digite o valor do mes: ");
            this.ano = t.nextInt();
        }
    }

    public void entraAno() {
        System.out.println("Digite o valor do ano: ");
        this.ano = t.nextInt();
        while (this.ano > 12 || this.ano < 1) {
            System.out.println("Digite o valor do ano: ");
            this.ano = t.nextInt();
        }
    }

    public int retDia() {
        return (this.dia);
    }

    public int retMes() {
        return (this.mes);
    }

    public int retAno() {
        return (this.ano);
    }

    public void mostra1() {
        System.out.println(this.retDia() + "/" + this.retMes() + "/" + this.retAno());
    }
    public void mostra2(){
        System.out.println("");
    }

}
