
package tarefa1;

import java.util.Scanner;

public class Tarefa1 {

      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Conta conta = new Conta(null, 0, 0.0);
            System.out.println("Digite seu nome:\n ");
            conta.setNome(scan.nextLine());
            System.out.println("Numero da conta:\n  ");
            conta.setNumero(scan.nextInt());
            System.out.println("Digite o saldo:\n ");
            conta.setSaldo(scan.nextDouble());
            while (true) {
                  System.out.println("Digite: \n 1= Para Sacar\n 2=Para Depositar\n Outro numero para sair\n");
                  switch (scan.nextInt()) {
                        case 1:
                              System.out.println("Digite o valor que deseja sacar:");
                              if (conta.sacar(scan.nextDouble())) {
                                    System.out.println("\nSaque realizado com suceso\n");
                              } else {
                                    System.out.println("\nLimite insuficiente\n");
                              }
                              break;
                        case 2:
                              System.out.println("Digite o valor que deseja depositar:");
                              if (conta.depositar(scan.nextDouble())) {
                                    System.out.println("Saque realizado com suceso\n");
                              } else {
                                    System.out.println("Valor invlido\n");
                              }
                              break;
                        default:
                              break;
                  }
                  System.out.println("Saldo atual: " + conta.getSaldo());
            }
      }
}
