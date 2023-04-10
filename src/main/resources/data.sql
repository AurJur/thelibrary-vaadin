INSERT INTO user (user_id, full_name, email, phone, city, address) VALUES
(1, 'John Doe', 'johndoe@example.com', '111-111-1111', 'Seattle', '123 Main St'),
(2, 'Jane Smith', 'janesmith@example.com', '222-222-2222', 'New York', '456 Elm St'),
(3, 'Bob Johnson', 'bobjohnson@example.com', '333-333-3333', 'Los Angeles', '789 Oak St');

INSERT INTO user_creds (creds_id, user_id, username, password) VALUES
(1, 1, 'jd', 'password1'),
(2, 2, 'js', 'password2'),
(3, 3, 'bj', 'password3');

INSERT INTO book (book_id, title, author, publisher, isbn, publication_date, genres, number_of_pages, tags, contributor_id, current_keeper_id) VALUES
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Scribner', '978-0743273565', '1925-04-10', 'Novel', 180, 'Classic', 1, 3),
(2, 'To Kill a Mockingbird', 'Harper Lee', 'J. B. Lippincott & Co.', '978-0446310789', '1960-07-11', 'Novel', 281, 'Classic', 1, 3),
(3, 'The Catcher in the Rye', 'J.D. Salinger', 'Little, Brown and Company', '978-0316769488', '1951-07-16', 'Novel', 277, 'Classic', 2, 1);

INSERT INTO loan_history (book_id, user_id, loan_date, due_date) VALUES
(1, 2, '2022-04-05', '2022-04-12'),
(2, 2, '2022-04-05', '2022-04-13'),
(3, 1, '2023-01-01', '2023-01-10');

INSERT INTO reservation_queue (book_id, user_id, reservation_date) VALUES
(1, 1, '2023-04-05'),
(2, 1, '2023-04-05'),
(3, 3, '2023-04-06');