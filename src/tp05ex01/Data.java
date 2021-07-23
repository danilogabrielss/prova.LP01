package tp05ex01;

import java.util.Scanner;

public class Data {

    Scanner t = new Scanner(System.in);

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        setDia();
        setDia(dia);
        setMes();
        setMes(mes);
        setAno();
        setAno(ano);
        mostra1();
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public void setDia() {
        System.out.print("Digite o valor do dia: ");
        this.dia = t.nextInt();
        while (this.dia > 31 || this.dia < 1) {
            System.out.print("Digite o valor do dia: ");
            this.dia = t.nextInt();
        }
    }

    public void setMes() {
        do {
            System.out.print("Digite o valor do mes: ");
            this.mes = t.nextInt();
        } while (this.mes > 12 || this.mes < 1);
        while (this.dia > 30 && (this.mes == 2 || this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
            System.out.print("Dia digitado não existe no mês/ano digitados\nDigite o valor do mes: ");
            this.mes = t.nextInt();
        }
    }

    public void setAno() {
        do{
        System.out.print("Digite o valor do ano: ");
        this. ano = t.nextInt();
        }while(this.ano < 0);
        if(this.dia > 28 && this.mes == 2){
            System.out.print("Dia inexistente, digite outro dia: ");
            this.dia = t.nextInt();
        }
    }

    public int getDia() {
        return (this.dia);
    }

    public int getMes() {
        return (this.mes);
    }

    public int getAno() {
        return (this.ano);
    }

    public String mostra1() {
        String time;
        time = (this.dia + "/" + this.mes + "/" + this.ano);
        return time;
    }

    public boolean bissexto() {
        if(this.ano % 4 == 0){
            if(this.ano % 100 == 0){
                if(this.ano % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}