package library.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message="Это поле необходимо заполнить")
    @Column(name = "name")
    private String name;
    @NotEmpty(message="Это поле необходимо заполнить")
    @Column(name = "lastName")
    private String lastName;
    @Min(value=0, message = "Год рождения не может быть отрицательным")
    @Column(name = "year")
    private int year;
    @OneToMany(mappedBy = "owner")
    private List<Book> books;

    public Person(){}

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
