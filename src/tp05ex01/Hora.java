package tp05ex01;

import java.util.Scanner;

class Hora {

    private int hora;
    private int min;
    private int seg;
    Scanner t = new Scanner(System.in);

    public Hora() {
        setHor();
        setHor(hora);
        setMin();
        setMin(min);
        setSeg();
        setSeg(seg);
        System.out.println(getHora1());
        System.out.println(getHora2());
        System.out.println("Total de segundos no dia: " + getSegundos());
    }

    public Hora(int h, int m, int s) {
        h = 0;
        m = 0;
        s = 0;
    }

    public void setHor(int h) {
        
    }

        public void setMin(int m) {
        
    }

    public void setSeg(int s) {
        
    }
    
    public void setHor(){
        do{
            System.out.print("Digite o valor da hora: ");
            this.hora = t.nextInt();
        }while (hora < 0 || hora >= 24);
    }
    
    public void setMin(){
        do{
            System.out.print("Digite o valor dos minutos: ");
            this.min = t.nextInt();
        }while (min < 0 || min >= 60);
    }

    public void setSeg(){
        do{
            System.out.print("Digite o valor dos segundos: ");
            this.seg = t.nextInt();
        }while (seg < 0 || seg >= 60);
    }
    
    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        return getHor() + ":" + getMin() + ":" + getSeg();
    }

    public String getHora2() {
        if (hora < 12) {
            return getHor() + ":" + getMin() + ":" + getSeg() + " AM";
        } else {
            return getHor() - 12 + ":" + getMin() + ":" + getSeg() + " PM";
        }
    }

    public int getSegundos() {
        int totalsegundos;
        totalsegundos = this.hora * 3600 + this.min * 60 + this.seg;
        return totalsegundos;
    }

}
