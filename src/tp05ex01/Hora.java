package tp05ex01;

import java.util.Scanner;

public class Hora {

    private int hora;
    private int min;
    private int seg;
    Scanner t = new Scanner(System.in);

    public Hora() {
        setHor();
        setMin();
        setSeg();
        System.out.println(getHora1());
        System.out.println(getHora2());        
    }

    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }    
    
    public void setHor(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public void setHor() {
        do {
            System.out.print("Digite o valor da hora: ");
            this.hora = t.nextInt();
        } while (hora < 0 || hora >= 24);
    }

    public void setMin() {
        do {
            System.out.print("Digite o valor dos minutos: ");
            this.min = t.nextInt();
        } while (min < 0 || min >= 60);
    }

    public void setSeg() {
        do {
            System.out.print("Digite o valor dos segundos: ");
            this.seg = t.nextInt();
        } while (seg < 0 || seg >= 60);
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
