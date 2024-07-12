package com.mycompany.transportepilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaEstatica<Caminhoneiro> fila = new FilaEstatica<>();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Caminhoneiro");
            System.out.println("2. Atender Próximo Caminhoneiro");
            System.out.println("3. Mostrar Fila Atual");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (!fila.isFull()) {
                        System.out.print("Nome do Caminhoneiro: ");
                        String nome = scanner.nextLine();

                        System.out.print("Placa do Caminhão: ");
                        String placa = scanner.nextLine();

                        Caminhoneiro novoCaminhoneiro = new Caminhoneiro(nome, placa);
                        fila.enqueue(novoCaminhoneiro);

                        System.out.println("Caminhoneiro cadastrado com sucesso!");
                        System.out.println("Horário de chegada: " + novoCaminhoneiro);
                    } else {
                        System.out.println("A fila está cheia. Não é possível cadastrar mais caminhoneiros.");
                    }
                    break;

                case 2:
                    if (!fila.isEmpty()) {
                        Caminhoneiro caminhoneiroAtendido = fila.dequeue();
                        System.out.println("Caminhoneiro atendido:");
                        System.out.println(caminhoneiroAtendido);
                    } else {
                        System.out.println("Não há caminhoneiros na fila para atender.");
                    }
                    break;

                case 3:
                    System.out.println("Fila de Caminhoneiros:");
                    System.out.println(fila);
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
