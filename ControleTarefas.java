import java.util.ArrayList;

public class ControleTarefas {
    private ArrayList<Tarefa> tarefas;

    public ControleTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa '" + tarefa.getNome() + "' adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                Tarefa t = tarefas.get(i);
                System.out.println((i + 1) + ". Nome: " + t.getNome() + " | Status: " + t.getStatus() + " | Data de Criação: " + t.getDataCriacao());
            }
        }
    }

    public void modificarStatus(int index, String novoStatus) {
        if (index > 0 && index <= tarefas.size()) {
            tarefas.get(index - 1).setStatus(novoStatus);
            System.out.println("Status da tarefa '" + tarefas.get(index - 1).getNome() + "' alterado para: " + novoStatus);
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public Tarefa getTarefa(int index) {
        if (index > 0 && index <= tarefas.size()) {
            return tarefas.get(index - 1);
        }
        return null;
    }
}
