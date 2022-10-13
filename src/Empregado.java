import java.util.Scanner;
public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private double salarioAnual;
    private double salarioAumento;

    public Empregado (String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    Scanner scn = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Seu nome é " + nome + " " + sobrenome + " e seu salário é: R$" + salario;
    }

    public double salarioAnual() {
        salarioAnual = salario*12;
        this.salarioAnual = salarioAnual;
        return + salarioAnual;
    }

    public double salarioAumento() {
        this.salario = salario * 1.1;
        System.out.println("Aumento de 10% no salário!");
        return salarioAumento;
    }
}
