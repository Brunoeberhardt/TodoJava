import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleTarefas controleTarefas = new ControleTarefas();

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Modificar Status de Tarefa");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a anotação da tarefa:");
                    String anotacao = scanner.nextLine();
                    System.out.println("Digite o status da tarefa:");
                    String status = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(nome, anotacao, status);
                    controleTarefas.adicionarTarefa(novaTarefa);
                    break;

                case 2:
                    controleTarefas.listarTarefas();
                    break;

                case 3:
                    System.out.println("Digite o número da tarefa que deseja modificar o status:");
                    controleTarefas.listarTarefas();
                    int tarefaIndex = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
                    System.out.println("Digite o novo status da tarefa:");
                    String novoStatus = scanner.nextLine();
                    controleTarefas.modificarStatus(tarefaIndex, novoStatus);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
