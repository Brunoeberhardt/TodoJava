import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do{
            String menu = "Escolha uma opção:\n"
                    + "1. Adicionar Tarefa\n"
                    + "2. Listar Tarefas\n"
                    + "3. Remover Tarefa\n"
                    + "4. Sair";
            System.out.println(menu);
            escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha){
                case 1:
                    System.out.println("Defina um nome para sua tarefa:");
                    String novaTarefa = scanner.nextLine();

                    if (!tarefas.contains(novaTarefa)) {
                        tarefas.add(novaTarefa);
                        System.out.println("Tarefa " + novaTarefa + " criada com sucesso!\n");
                    } else {
                        System.out.println("Essa tarefa já existe!\n");
                    }

                    break;
                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada!\n");
                    } else {
                        for (int i = 1; i <= tarefas.size(); i++) {
                            System.out.println(i + "-" + tarefas.get(i - 1));
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("Qual tarefa deseja remover?");
                    if (scanner.hasNextInt()) {
                        int selecao = scanner.nextInt();
                        scanner.nextLine();

                        if (selecao > 0 && selecao <= tarefas.size()) {
                            String tarefaRemovida = tarefas.get(selecao - 1);
                            tarefas.remove(selecao - 1);
                            System.out.println("Tarefa " + selecao + "-" + tarefaRemovida + " excluída!\n");
                        } else {
                            System.out.println("Esta tarefa não existe!\n");
                        }
                    } else {
                        System.out.println("Por favor, insira um número válido.\n");
                        scanner.nextLine();
                    }

            }
        }while(escolha != 4);
    }
}
