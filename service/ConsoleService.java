package service;

import java.util.Scanner;

public class ConsoleService {
    static Scanner input = new Scanner(System.in);
    static GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();

    public static void menu() throws InterruptedException {
        System.out.println("Bem vindos a seu gerenciador de tarefas");

        while (true) {
            menuOptions();

            String opt = input.nextLine();

            switch (opt) {
                case "1":
                    System.out.println("Qual o titulo da sua tarefa: ");
                    String title = input.nextLine();

                    System.out.println("Qual é a descrição da sua tarefa");
                    String description = input.nextLine();

                    if (!GerenciadorDeTarefas.isDescriptionInvalid(description)) continue;
                    gerenciadorDeTarefas.createNewTask(title,description);
                    continue;

                case "2":
                    gerenciadorDeTarefas.listAll();
                    continue;

                case "3":
                    gerenciadorDeTarefas.listTaskPending();
                    continue;

                case "4":
                    System.out.println("Qual tarefa deseja marcar como concluida?");
                    System.out.println("Informe o titulo dessa tarefa");
                    String taskTitle = input.nextLine();

                    gerenciadorDeTarefas.markAsCompleted(taskTitle);
                    continue;

                case "5":
                    System.out.println("Qual tarefa você deseja deletar?");
                    System.out.println("Informe o titulo dessa tarefa");
                    taskTitle = input.nextLine();

                    gerenciadorDeTarefas.deleteTask(taskTitle);
                    System.out.println("Tarefa deletada!");
                    continue;

                case "6":
                    System.out.println("Obrigado ate logo!!!");
                    return;
            }

        }
    }

    private static void menuOptions() {
        System.out.println("Escolha uma opção abaixo: ");
        System.out.println("1. Criar nova tarefa");
        System.out.println("2. litar todas as tarefas");
        System.out.println("3. litar tarefas pendentes");
        System.out.println("4. marcar tarefa como cuncluida");
        System.out.println("5. remover tarefa");
        System.out.println("6. sair");
    }


}
