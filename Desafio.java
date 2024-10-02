import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "John Doe";
        String tipoConta = "corrente";
        double saldo = 2465.70;
        int opcao = 0;

        System.out.println("*".repeat(25));
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo + "\n");
        System.out.println("*".repeat(25));

        String menu =
                """
                \n
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("\nSeu saldo é R$" + saldo);
            } else if(opcao == 2){
                System.out.println("\nQual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("\nSaldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("\nValor transferido!");
                    System.out.println("Seu saldo é R$" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nSeu novo saldo é R$" + saldo);
            }else if (opcao != 4) {
                System.out.println("\nOpção invalida");
            }

        }
    }
}
