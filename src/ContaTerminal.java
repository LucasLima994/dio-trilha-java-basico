import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomecliente;
        double deposito;
        double saldo;


        System.out.println("Por Favor, informe o número da Conta: ");
        numero = scan.nextInt();

        do{
            do{
                System.out.println("Por Favor, informe o número da Agencia: ");
            agencia = scan.next();
        }while (agencia.length()> 5);
        }while (agencia.length()< 5);

do {
    do{
    System.out.println("Informe o seu nome: ");
    nomecliente = scan.nextLine();
    }while (nomecliente.length() <5);
    }while (nomecliente.length() >30);


        System.out.println("Informe o valor que será depositado: ");
        deposito = scan.nextDouble();

        saldo = deposito + 0;

        System.out.println("Informações da Conta");
        System.out.println("Nome do Cliente " + nomecliente);
        System.out.println("Conta Bancaria " + numero + " Agencia " + agencia);
        System.out.println("Saldo da Conta: " + saldo);
    }
}
