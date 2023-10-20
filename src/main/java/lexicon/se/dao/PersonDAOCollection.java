package lexicon.se.dao;

import lexicon.se.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {
   private ArrayList<Person> people;

    @Override
    public Person persist(Person person) {
        if (Person.getId() == -1){
            Person.setId(PersonId.nextId());
        }

        people.remove(a-> a.getId() == person.getId());
        people.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
      for (Person person:people){
          if ( person.getId()==id){

          }
          return person;
      }

        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person:people){
            if (person.getEmail()==email){

            }
            return person;
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return List.copyOf(people);



    }

    @Override
    public void remove(int id) {
        this.people.remove(people.getId() ==id);

    }
}
