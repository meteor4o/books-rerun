package bg.softuni.booksrerun.model.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "authors")
public class AuthorEntity extends BaseEntity {
    private String name;
    private List<BookEntity> booksByAuthor = new LinkedList<>();

    public String getName() {
        return name;
    }

    public AuthorEntity setName(String name) {
        this.name = name;
        return this;
    }
    @OneToMany
    public List<BookEntity> getBooksByAuthor() {
        return booksByAuthor;
    }

    public AuthorEntity setBooksByAuthor(List<BookEntity> booksByAuthor) {
        this.booksByAuthor = booksByAuthor;
        return this;
    }
}
