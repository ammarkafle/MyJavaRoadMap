package MyProject.Java.ToDoListProject;

import MyProject.Java.ToDoListProject.Model.Priority;
import MyProject.Java.ToDoListProject.Model.Task;
import MyProject.Java.ToDoListProject.Service.TaskService;

import java.util.Scanner;

public class ToDoListMain {
  public   static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      TaskService service = new TaskService();

      while (true) {

          System.out.println("\n===== TO-DO LIST =====");
          System.out.println("1. Add Task");
          System.out.println("2. View Tasks");
          System.out.println("3. Complete Task");
          System.out.println("4. Delete Task");
          System.out.println("5. Exit");

          System.out.print("Enter choice: ");
          int choice = input.nextInt();
          input.nextLine();

          switch (choice) {

              case 1:

                  System.out.print("Enter ID: ");
                  int id = input.nextInt();
                  input.nextLine();

                  System.out.print("Enter title: ");
                  String title = input.nextLine();

                  System.out.print("Enter description: ");
                  String description = input.nextLine();

                  System.out.print("Enter priority: ");
                  String priorityInput = input.nextLine();

                  Priority priority =
                          Priority.valueOf(priorityInput.toUpperCase());

                  System.out.print("Enter due date: ");
                  String dueDate = input.nextLine();

                  Task task = new Task(
                          id,
                          title,
                          description,
                          priority,
                          dueDate
                  );

                  service.addTask(task);
                  break;

              case 2:
                  service.showAllTasks();
                  break;

              case 3:

                  System.out.print("Enter task ID: ");
                  int completeId = input.nextInt();

                  service.completeTask(completeId);
                  break;

              case 4:

                  System.out.print("Enter task ID: ");
                  int deleteId = input.nextInt();

                  service.deleteTask(deleteId);
                  break;

              case 5:

                  System.out.println("Program ended.");
                  input.close();
                  return;

              default:
                  System.out.println("Invalid choice.");
          }
      }
    }

}
