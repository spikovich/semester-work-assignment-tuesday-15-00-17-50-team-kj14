CREATE TABLE Users (
                       user_id INTEGER PRIMARY KEY AUTOINCREMENT,
                       username TEXT NOT NULL,
                       password TEXT NOT NULL,
                       role_id INTEGER,
                       email TEXT,
                       FOREIGN KEY (role_id) REFERENCES Roles(role_id)
);

CREATE TABLE Books (
                       book_id INTEGER PRIMARY KEY AUTOINCREMENT,
                       title TEXT NOT NULL,
                       author TEXT NOT NULL,
                       isbn TEXT NOT NULL,
                       available_copies INTEGER
);

CREATE TABLE Roles (
                       role_id INTEGER PRIMARY KEY AUTOINCREMENT,
                       role_name TEXT NOT NULL
);

CREATE TABLE Transactions (
                              transaction_id INTEGER PRIMARY KEY AUTOINCREMENT,
                              user_id INTEGER,
                              book_id INTEGER,
                              action TEXT NOT NULL,
                              date TEXT,
                              FOREIGN KEY (user_id) REFERENCES Users(user_id),
                              FOREIGN KEY (book_id) REFERENCES Books(book_id)
);
