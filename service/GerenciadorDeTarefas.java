package service;

import model.StatusType;
import model.Tarefa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {

    List<Tarefa> tarefas = new ArrayList<>();

    public void createNewTask(String title, String description) throws InterruptedException {
        System.out.println("Criando nova tarefa...");
        Thread.sleep(2000);
        System.out.println("Nova tarefa criada: ");
        System.out.printf("Titulo: %s%nDescrição: %s%n" , title, description);

        Tarefa newTarefa = new Tarefa(title, description, StatusType.PENDENTE, LocalDateTime.now());
        tarefas.add(newTarefa);
    }

    public void listAll() {
        if (tarefas.isEmpty()){
            System.out.println("Você não possui tarefas, aperte 1, e crie novas tarefas");
            return;
        }
        tarefas.forEach(System.out::println);
    }

    public void listTaskPending() {
        List<Tarefa> taskPending = tarefas.stream()
                .filter(task -> task.getStatus() == StatusType.PENDENTE)
                .toList();

        for (Tarefa tarefa : taskPending) {
            System.out.println("ID: " + tarefa.getId());
            System.out.println("TITULO: " + tarefa.getTitle());
            System.out.println("DESCRIÇÃO: " + tarefa.getDescription());
        }
    }

    public void markAsCompleted(String title) {
        for (Tarefa task : tarefas) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setStatus(StatusType.CONCLUIDA);
                System.out.println("Status da tarefa alterado com sucesso!");
                return;
            }
        }

        System.out.println("Tarefa não encontrada");
    }

    public void deleteTask(String title) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa task = tarefas.get(i);
            if (task.getTitle().equalsIgnoreCase(title)) {
                tarefas.remove(task);
                System.out.println("Tarefa removida com sucesso");
                return;
            }
        }

        System.out.println("Tarefa não encontrada");
    }

    public static boolean isDescriptionInvalid(String description) {
        if (description.length() < 3) {
            System.out.println("Sua descrição tem que ser maior que 3 caracteres.");
            return false;
        }
        return true;
    }

}
