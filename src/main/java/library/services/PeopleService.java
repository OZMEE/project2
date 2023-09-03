package library.services;

import library.models.Book;
import library.models.Person;
import library.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll(){
        return peopleRepository.findAll();
    }

    public Person findById(int id){
        Optional<Person> person =  peopleRepository.findById(id);

        return person.orElse(null);
    }

    public Person findByNameAndLastname(String name, String lastName){
        List<Person> person = peopleRepository.findByNameAndLastName(name, lastName);
        return person.get(0);
    }

    @Transactional
    public void deleteById(int id){
        peopleRepository.deleteById(id);
    }

    @Transactional
    public void save(Person person){
        peopleRepository.save(person);
    }
    @Transactional
    public void update(int id, Person updatedPerson){
        updatedPerson.setId(id);
        peopleRepository.save(updatedPerson);
    }

    public List<Book> checkBook(int id){
        Optional<Person> person = peopleRepository.findById(id);
        return person.orElse(null).getBooks();
    }
}
