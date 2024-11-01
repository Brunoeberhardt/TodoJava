import metodos.ControleTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do{
            String menu = "AAAAAAAAEscolha uma opção:\n"
                    + "1. Adicionar Tarefa\n"
                    + "2. Listar Tarefas\n"
                    + "3. Remover Tarefa\n"
                    + "4. Sair";
            System.out.println(menu);
            escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha){
                case 1:
                    System.out.println("Digite o nome da tarefa:");
                    String novaTarefa = scanner.nextLine();
                    ControleTarefas.adicionarTarefa(tarefas, novaTarefa);
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada!\n");
                    } else {
                        ControleTarefas.listarTarefa(tarefas);
                    }
                    break;
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia! Não há tarefas para remover.\n");
                    } else {
                        System.out.println("Qual tarefa deseja remover?");
                        if (scanner.hasNextInt()) {
                            int selecao = scanner.nextInt();
                            scanner.nextLine();
                            ControleTarefas.removerTarefa(tarefas, selecao);
                        } else {
                            System.out.println("Por favor, insira um número válido.\n");
                            scanner.nextLine();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, selecione uma opção de 1 a 4.\n");
                    break;


            }
        }while(escolha != 4);
    }
}
