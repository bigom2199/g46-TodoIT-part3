package lexicon.se.dao;

import lexicon.se.TodoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemDAOCollection implements TodoItemDAO {
    @Override
    public TodoItem persist(TodoItem item) {
        if (item.getId()==-1){
            item.setId(TodoItemIdSequencer).nextId();

        }
        items.remove(item.getId()== item.getId());
        items.add(item);
        return item;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem item:item){
            if (item.getId()== id){
                return item;
            }
        }

   return null;

    }

    @Override
    public Collection<TodoItem> findAll() {
        return List.copyOf(items);

    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {

        return this.findAll().stream().filter(a-> a.isDone().Collect(Collectors.toList()));
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        return this.findAll().stream().filter(a-> a.getTitle().contains(title).Collect(Collectors.toList()));
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        return this.findAll().stream().filter(a-> a.getCreator()!=null).filter(a-> a.getCreator().getId()==personId)
                .collect(Collectors.toList());

    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {

        return this.findAll().stream().filter(a-> a.getDeadline().isBefore(date))
                .collect(Collectors.toList());

    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {

        return this.findAll().stream().filter(a-> a.getDeadline().isAfter(date))
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
         this.items.remove(a-> a.getId() == id);

    }
}
