package tp05ex01;

import java.util.Scanner;

public class ConsultaAgendada {

    Scanner t = new Scanner(System.in);

    //Atributos
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    //Construtores
    public ConsultaAgendada() {
        System.out.print("Digte o nome do paciente: ");
        this.nomeMedico = t.next();
        System.out.println("Digite o ");
    }

    public ConsultaAgendada(int i, int mi, int s, int d, int m, int a, String p, String sm) {
        
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {

    }

    public void setData(int a, int b, int c) {

    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setData() {

    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public static void setQuantidade(int quantidade) {
        ConsultaAgendada.quantidade = quantidade;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public static void main(String[] args) {

    }

}
