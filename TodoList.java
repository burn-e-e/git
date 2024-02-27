public class TodoList {

    private DoubleEndedLinkedList<Task> tasks;

    public TodoList() {
        tasks = new DoubleEndedLinkedList<>();
    }

    public void addTask(Task task) {
        tasks.insertLast(task);
    }

    public void removeTask(Task task) {
        tasks.removeByData(task);
    }

    public void markTaskAsCompleted(Task task) {
        task.setCompleted(true);
    }

    public void markTaskAsIncomplete(Task task) {
        task.setCompleted(false);
    }

    public String listTasks() {
        StringBuilder sb = new StringBuilder();
        for (Task task : tasks) {
            sb.append(task.toString()).append("\n");
        }
        return sb.toString();
    }
}