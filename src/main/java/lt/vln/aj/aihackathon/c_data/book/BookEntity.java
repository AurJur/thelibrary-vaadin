package lt.vln.aj.aihackathon.c_data.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lt.vln.aj.aihackathon.c_data.user.UserEntity;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-05
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class BookEntity { //Book table - Contains information about books in the library

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(name = "genres") //a list?
    private String genres;

    @Column(name = "number_of_pages")
    private Integer numberOfPages;

    @Column(name = "tags")
    private List<String> tags;

    @ManyToOne
    @JoinColumn(name = "contributor_id")
    private UserEntity contributor; //Foreign key to User table

    @ManyToOne
    @JoinColumn(name = "current_keeper_id")
    private UserEntity currentKeeper; //Foreign key to User table

}
