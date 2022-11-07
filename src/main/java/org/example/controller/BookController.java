package org.example.controller;

import org.example.Book;
import org.example.Genre;
import org.example.command.CommandAbstract;
import org.example.command.ListBook;

import java.util.UUID;

public class BookController {
    private Book model;
    private ListBook view;

    public BookController(Book model, ListBook view){
        this.model = model;
        this.view = view;
    }

    public void setBookGenreController(Genre genre){
        model.setGenre(genre);
    }
    public Genre getBookGenreController(){
        return model.getGenre();
    }
    public void setBookAuthorController(String author){
        model.setAuthor(author);
    }
    public String getBoolAuthorController(){
        return  model.getAuthor();
    }
    public void setBookTitleController(String title){
        model.setTitle(title);
    }
    public String getBookTitleController(){
        return model.getTitle();
    }
    public void setBookUuidController(UUID clientId){
        model.setId(clientId);
    }
    public UUID getBookUuidController(){
        return model.getId();
    }

    public void updateView(){
        view.soutBook(model.getAuthor(), model.getGenre(), model.getTitle());
    }
}
