import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); //To clean scanner's input

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo disponível!");
        saldo = scanner.nextDouble();

        System.out.println(
            "Olá " +
            nomeCliente +
            ", obrigado por criar uma conta em nosso banco! Sua agência é " +
            agencia +
            ", conta " +
            numero +
            " e seu saldo " +
            saldo +
            " já está disponível para saque");

        scanner.close();
    }
}
