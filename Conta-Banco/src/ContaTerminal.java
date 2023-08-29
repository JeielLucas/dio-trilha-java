import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name, agencia;
        double saldo;
        int conta;
        System.out.print("Digite seu nome: ");
        name = sc.next();
        System.out.print("Digite sua agência: ");
        agencia = sc.next();
        System.out.print("Digite sua conta: ");
        conta = sc.nextInt();
        System.out.print("Digite seu saldo: ");
        saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", name, agencia, conta, saldo);
    }
}