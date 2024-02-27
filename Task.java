public class Task {

    private String description;
    private boolean isCompleted;
    private String dueDate; // Optional field for due date

    public Task(String description) {
        this.description = description;
        this.isCompleted = false; // Initially set to incomplete
    }

    public Task(String description, String dueDate) {
        this(description); // Call the first constructor for description
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Additional methods for customization:

    public void markAsCompleted() {
        setCompleted(true);
    }

    @Override
    public String toString() {
        String status = isCompleted ? "Completed" : "Incomplete";
        return description + " (" + status + ")";
    }
}
