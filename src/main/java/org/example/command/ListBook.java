package org.example.command;

import org.example.Book;
import java.util.List;

public class ListBook extends CommandAbstract{
    @Override
    public void Command(List books) {
        for (int i=0;i<books.size();i++){
            Book book = (Book) books.get(i);
            String bookAvailabilityInTheLibrary = "";
            if (book.getId() != null){
                bookAvailabilityInTheLibrary = " -Эту книгу уже забрал другой клиент-";
            }
            System.out.println(book.getAuthor()+" "+book.getTitle()+" "+book.getGenre().getTitleGenre()+bookAvailabilityInTheLibrary);
        }
    }

    @Override
    public void Command() {

    }
}
