package com.example;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Genre genre;

    // Getters and setters
}
