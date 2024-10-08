import java.util.Locale;
import java.util.Scanner;

public class ContaTermnal {
    public static void main(String[] args) throws Exception {

        double saldo = 0;
        //Utiliza a classe Scanner para obter a entrada do usuário
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scan.nextLine(); 

        System.out.println("Por favor, digite o número da agência: ");
        int numeroAgencia = scan.nextInt();

        System.out.println("Por favor, digite o número  da conta: ");
        String numeroConta = scan.next();

        System.out.println("Por favor, digite um valor de deposito: ");
        double valorDeposito = scan.nextDouble();
        saldo = valorDeposito;

        System.out.printf("\"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo R$ %.2f já está disponível para saque.\"",nomeCliente, numeroAgencia,numeroConta,saldo);

        scan.close();
    }
}