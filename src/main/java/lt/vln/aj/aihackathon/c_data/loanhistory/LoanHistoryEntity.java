package lt.vln.aj.aihackathon.c_data.loanhistory;

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
import lt.vln.aj.aihackathon.c_data.book.BookEntity;
import lt.vln.aj.aihackathon.c_data.user.UserEntity;

import java.time.LocalDate;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-05
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loan_history")
public class LoanHistoryEntity { //Loan History table - Contains information about books history

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long loanId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity book; //Foreign key to Book table

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user; //Foreign key to User table

    @Column(name = "loan_date")
    private LocalDate loanDate;

    @Column(name = "due_date")
    private LocalDate dueDate;

}
