import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// todo:conhecer e importa a classe Scanner
//Exibe as menssagens para o nosso usuário 
//obeter pela scanner os valores digitados no terminal 
//Exibir a mensagem conta criada
        System.out.println("Digite o numero da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
            "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

}
    }

