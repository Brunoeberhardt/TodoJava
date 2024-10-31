package metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleTarefas {
    public static void adicionarTarefa(ArrayList<String> tarefas, String novaTarefa){
        if (novaTarefa.isEmpty()) {
            System.out.println("O nome da tarefa não pode ser vazio.\n");
            return;
        }

        if (!tarefas.contains(novaTarefa)) {
            tarefas.add(novaTarefa);
            System.out.println("Tarefa " + novaTarefa + " criada com sucesso!\n");
        } else {
            System.out.println("Essa tarefa já existe!\n");
        }
    }
    public static void listarTarefa(ArrayList<String>tarefas){
        for (int i = 1; i <= tarefas.size(); i++) {
            System.out.println(i + "-" + tarefas.get(i - 1));
        }
        System.out.println("\n");
    }
    public static void removerTarefa(ArrayList<String> tarefas, int selecao){
        if (selecao > 0 && selecao <= tarefas.size()) {
            String tarefaRemovida = tarefas.get(selecao - 1);
            tarefas.remove(selecao - 1);
            System.out.println("Tarefa " + selecao + "-" + tarefaRemovida + " excluída!\n");
        } else {
            System.out.println("Esta tarefa não existe!\n");
        }
    }
}
