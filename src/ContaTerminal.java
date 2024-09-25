import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as seguintes informações da conta: ");
        System.out.println("Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Saldo: ");
        saldo = scanner.nextFloat();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e o seu saldo %.2f está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
    }
}
