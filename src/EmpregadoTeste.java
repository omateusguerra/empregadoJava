import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("\n--- EMPREGADO Nº1 ---");


        Empregado empregado1 = new Empregado("qualquer", "nome", 00.0);

        System.out.println("Digite seu nome: ");
        empregado1.setNome(scn.nextLine());
        empregado1.getNome();

        System.out.println("Digite seu sobrenome: ");
        empregado1.setSobrenome(scn.nextLine());
        empregado1.getSobrenome();

        System.out.println("Digite seu salário: ");
        empregado1.setSalario(scn.nextDouble());
        empregado1.getSalario();

        System.out.println(empregado1);

        System.out.println("Seu salário anual é: R$" + empregado1.salarioAnual());
        empregado1.salarioAumento();
        System.out.println("Seu salário anual é: R$" + empregado1.salarioAnual());

        System.out.println("\n--- EMPREGADO Nº2 ---");

        Empregado empregado2 = new Empregado("qualquer", "nome", 00.0);

        System.out.println("Digite seu nome: ");
        empregado2.setNome(scn2.nextLine());
        empregado2.getNome();

        System.out.println("Digite seu sobrenome: ");
        empregado2.setSobrenome(scn2.nextLine());
        empregado2.getSobrenome();

        System.out.println("Digite seu salário: ");
        empregado2.setSalario(scn2.nextDouble());
        empregado2.getSalario();

        System.out.println(empregado1);

        System.out.println("Seu salário anual é: R$" + empregado2.salarioAnual());
        empregado2.salarioAumento();
        System.out.println("Seu salário anual é: R$" + empregado2.salarioAnual());

        /*System.out.println("Digite seu nome: ");
        System.out.println("Digite seu sobrenome: ");
        System.out.println("Digite seu salário: ");
        Empregado empregado2 = new Empregado(scn.nextLine(), scn.nextLine(), scn.nextDouble());
        System.out.println("Seu salário anual é: R$" + empregado2);
        System.out.println(empregado2.salarioAnual());
        empregado2.salarioAumento();
        System.out.println("Seu salário anual é: R$" + empregado2.salarioAnual());*/
    }
}
