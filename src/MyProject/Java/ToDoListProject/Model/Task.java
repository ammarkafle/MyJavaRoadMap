package MyProject.Java.ToDoListProject.Model;

public class Task {
    private int id;
    private String title;
    private String description;
    private Priority priority;
    private String dueDate;
    private Status status;

    public Task(int id, String title, String description,
                Priority priority, String dueDate) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = Status.PENDING;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void markCompleted() {
        status = Status.COMPLETED;
    }

    public void displayTask() {

        System.out.println("-------------------------");
        System.out.println("ID          : " + id);
        System.out.println("Title       : " + title);
        System.out.println("Description : " + description);
        System.out.println("Priority    : " + priority);
        System.out.println("Due Date    : " + dueDate);
        System.out.println("Status      : " + status);
    }
}
