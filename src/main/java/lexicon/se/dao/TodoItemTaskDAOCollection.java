package lexicon.se.dao;

import lexicon.se.TodoItemTask;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO{

    @Override
    public TodoItemTask persist(TodoItemTask itemTask) {
        if (itemTask.getId()== -1){
            itemTask.setId(TodoItemTaskDAO.nextId());
        }
        itemTask.removeIf(a-> a.getId() == itemTask.getId());
        itemTask.add(itemTask);
        return itemTask ;
    }

    @Override
    public TodoItemTask findById(int id) {
        for (TodoItemTask itemTask:itemTasks){
            if(itemTask.getId() == id){
                return itemTask;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int PersonId) {

        return this.itemTasks.stream().filter(a-> a.getAssignee()!=null)
                .filter(a-> a.getAssignee().getId() == personId)
                .collect(collectors.toList());
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {

        return this.itemTasks.stream().filter(a-> a.isAssigned() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItemTask> findAll() {

        return List.copyOf(itemTasks);
    }

    @Override
    public void remove(int id) {
   this.itemTasks.removeIf(a-> a.getId() == id);
    }
}
