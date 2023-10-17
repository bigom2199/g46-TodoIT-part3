package lexicon.se;

import java.util.Objects;

public class TodoItemTask {
   private boolean assigned;
   private TodoItem todoItem ;
   private Person assignee;
   private int id;
   public TodoItemTask(boolean assigned,Person assignee,TodoItem todoItem,int id){
       this.assigned = assigned;
       this.assignee = assignee ;
       this.id = id;
       this.todoItem = todoItem;
   }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return assigned == that.assigned && id == that.id && Objects.equals(todoItem, that.todoItem) &&
                Objects.equals(assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assigned, todoItem, assignee, id);
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "assigned=" + assigned +
                ", todoItem=" + todoItem +
                ", assignee=" + assignee +
                ", id=" + id +
                '}';
    }
}
