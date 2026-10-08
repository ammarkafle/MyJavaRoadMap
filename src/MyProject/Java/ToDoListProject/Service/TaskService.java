package MyProject.Java.ToDoListProject.Service;

import MyProject.Java.ToDoListProject.Model.Task;

import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void showAllTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        for (Task task : tasks) {
            task.displayTask();
        }
    }

    public void deleteTask(int id) {

        for (Task task : tasks) {

            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task deleted.");
                return;
            }
        }

        System.out.println("Task not found.");
    }

    public void completeTask(int id) {

        for (Task task : tasks) {

            if (task.getId() == id) {
                task.markCompleted();
                System.out.println("Task completed.");
                return;
            }
        }

        System.out.println("Task not found.");
    }
}
