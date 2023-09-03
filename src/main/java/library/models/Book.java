package library.models;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message="Это поле необходимо заполнить")
    private String name;

    @NotEmpty(message="Это поле необходимо заполнить")
    @Column(name = "authorname")
    private String authorName;

    @Min(value=0, message="Год не может быть отрицательным")
    @Column(name = "year")
    private int year;

    @Column(name = "page")
    private String page;

    @ManyToOne
    @JoinColumn(name = "clientid", referencedColumnName = "id")
    private Person owner;

    public Book(){}

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

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return authorName;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public String getPage(){
        return page;
    }
    public void setPage(String page){
        this.page=page;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
