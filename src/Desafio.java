import java.util.Scanner;

public class Desafio {
        public static void main(String[] args) {
            String nome = "Márcio Junior";
            String tipo = "Conta Corrente";
            double saldo = 1000.59;
            int opcao = 0;

            System.out.println("===================================");
            System.out.println("Nome do Cliente: " + nome);
            System.out.println("Tipo de Conta: " + tipo);
            System.out.println("Saldo Atual: " + saldo);
            System.out.println("===================================\n");

            String menu = """
                    ** Opções **
                    1 - Consulta Saldo
                    2 - Saque/Transferir 
                    3 - Deposita
                    4 - Sair               
           
                    """;

            Scanner leitura = new Scanner(System.in);

            while (opcao != 4){
                System.out.println(menu);
                opcao = leitura.nextInt();

                if (opcao == 1){
                    System.out.println("O Saldo atual é: " + saldo);
                } else if (opcao ==2){
                    System.out.println("Qual valor deseja transferir/Sacar?");
                    double valor = leitura.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                        System.out.println("Saldo Atualizado: " + saldo);
                    }
                } else if (opcao == 3){
                    System.out.println("Qual valor deseja depositar?");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("O Saldo atualizado: " + saldo);
                }
            } if (opcao != 4){
                System.out.println("Opção incorreta, tente novamente.");
            }
        }
}


