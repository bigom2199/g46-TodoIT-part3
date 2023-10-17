package lexicon.se;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    private int id;
    private boolean done;
    private Person creator;
    private String title;
    private String description;

    private LocalDate deadline;
    public TodoItem(String title,String description,boolean done,LocalDate deadline,int id){
        this.id = id;
        this.deadline= deadline;
        this.description =description;
        this.title =title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty() ;
            throw new IllegalArgumentException("title is not empty!");


        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done &&
                Objects.equals(creator, todoItem.creator) && Objects.equals(title, todoItem.title) &&
                Objects.equals(description, todoItem.description) && Objects.equals(deadline, todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, done, creator, title, description, deadline);
    }

    public void setDeadline(LocalDate deadline) {


        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", done=" + done +
                ", creator=" + creator +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
