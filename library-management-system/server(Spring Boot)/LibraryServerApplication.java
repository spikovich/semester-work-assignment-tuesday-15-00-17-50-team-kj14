package com.library.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryServerApplication.class, args);
    }
}
```
        package com.library.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {

        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest loginRequest) {

        return "Login successful";
    }
}

```
        package com.library.server.controller;

import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        // Code to add book to the database
        return "Book added successfully";
    }

    @GetMapping("/list")
    public List<Book> listBooks() {
        // Code to list all books from the database
        return List.of();  // Placeholder
    }
}
