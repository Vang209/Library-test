package org.example.command;

import org.example.Genre;

import java.util.List;

public class ListGenre extends CommandAbstract{
    @Override
    public void Command(List books) {

    }

    @Override
    public void Command() {
        Genre[] genres = Genre.values();
        for (Genre genre:genres){
            System.out.println(genre.getTitleGenre());
        }
    }
}
