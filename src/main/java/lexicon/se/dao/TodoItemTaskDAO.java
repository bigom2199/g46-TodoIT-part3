package lexicon.se.dao;

import lexicon.se.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask itemTask);
    TodoItemTask findById(int id);
    Collection<TodoItemTask> findByPersonId(int PersonId);
    Collection<TodoItemTask> findByAssignedStatus(boolean status);
    Collection<TodoItemTask> findAll();
      void remove(int id);
}
