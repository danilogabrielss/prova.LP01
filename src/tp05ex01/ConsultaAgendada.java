package tp05ex01;

import java.text.DateFormat;
import java.util.Scanner;

public class ConsultaAgendada {

    Scanner t = new Scanner(System.in);

    //Atributos
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    //Construtores
    public ConsultaAgendada() {
        data = new Data();
        hora = new Hora();
        this.setNomePaciente();
        this.setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        data = new Data(d, m, a);
        hora = new Hora(h, mi, s);
        this.setNomePaciente(p);
        this.setNomeMedico(med);
        quantidade++;
    }

    /*public ConsultaAgendada(Data d, Hora h, String p, String med) {
        
    }*/
    public void setData(int a, int b, int c) {
        data.setDia(a);
        data.setMes(b);
        data.setAno(c);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setHora(int a, int b, int c) {
        this.hora.setHor(a);
        this.hora.setMin(b);
        this.hora.setSeg(c);
    }

    public void setHora() {
        this.hora.setHor();
        this.hora.setMin();
        this.hora.setSeg();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Digte o nome do paciente: ");
        setNomePaciente(t.next());
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do médico: ");
        setNomeMedico(t.next());
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

    public String getData() {
        String java = data.mostra1();
        return java;
    }

    public String getHora() {
        return this.hora.getHora1();
    }

    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(17, 10, 20, 25, 4, 2021, "Danilo", "Gabriel");
        System.out.println("P1\nNome do médico: " + p1.getNomeMedico());
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        System.out.println("Consulta marcada para o dia " + p1.getData() + " as " + p1.getHora() + "\nP2");
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("P2\nNome do médico: " + p2.getNomeMedico());
        System.out.println("Nome do paciente: " + p2.getNomePaciente());
        System.out.println("Consulta marcada para o dia " + p2.getData() + " as " + p2.getHora());
        System.out.println("\nAlterar P1");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        System.out.println("P1\nNome do médico: " + p1.getNomeMedico());
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        System.out.println("Consulta marcada para o dia " + p1.getData() + " as " + p1.getHora());
        System.out.println("Quantidade de consultas: " + ConsultaAgendada.quantidade);
    }

}