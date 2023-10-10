import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Cliente cliente = new Cliente();

        String name = "";
        int agencia = 0;
        int conta = 0;
        double saldo = 0;

        try {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();

            System.out.println("Digite sua agencia: ");
            agencia = scanner.nextInt();

            System.out.println("Digite seu numero da sua conta: ");
            conta = scanner.nextInt();

            System.out.println("Qual o valor que deseja depósitar? ");
            saldo = scanner.nextDouble();

            cliente.name = name;
            cliente.agencia = agencia;
            cliente.conta = conta;
            cliente.saldo = saldo;

            System.out.println("Olá," + name);
            System.out.println("Agência: " + agencia
                    + ", Conta: " + conta + ", Saldo: R$ " + saldo);
        } finally {
            scanner.close();
        }
    }
}
