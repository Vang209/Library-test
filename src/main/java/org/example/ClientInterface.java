package org.example;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClientInterface {
    Book filingBookData(){
        Scanner console = new Scanner(System.in);

        System.out.println("Заполните пожалуйста данные книги");
        System.out.println("Автор?");
        String clientAuthor = console.nextLine();
        System.out.println("Название книги?");
        String clientTitle = console.nextLine();
        System.out.println("Жанр?");
        String clientGenre = console.nextLine();

        Genre clientGenreEnum = Genre.fromTitle(clientGenre);
        Book clientBook = new Book(clientGenreEnum, clientAuthor, clientTitle);
        return clientBook;
    }

    public void serviceClient(List<Book> books, Client client) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы хотите взять или вернуть книгу?");
        System.out.println("1. Взять");
        System.out.println("2. Вернуть");
        System.out.println("3. Книги которые у меня есть");
        System.out.println("4. Вернуться в меню");

        int clientMyBook = scanner.nextInt();

        if (clientMyBook == 1) {

            Book clientBook = filingBookData();
            int numberOfBooks = 0;
            for (int i = 0; i < books.size(); i++) {
                if (clientBook.equals(books.get(i)) && books.get(i).getId() == null) {
                    numberOfBooks++;
                    System.out.println("Да, у нас есть такая книга, мы добавили ее в ваш раздел 'Мои книги'");
                    books.get(i).setId(client.uuid);
                    Date date = new Date();
                    Log.logs.add(new Log(books.get(i), client.uuid, TakeOrReturned.TAKE.getOperation(), date));
                    break;
                }
            }
            if (numberOfBooks == 0) {
                System.out.println("У нас нет такой книги или она взята другим клиентом :(");
            }

        } else if (clientMyBook == 2) {

            Book clientBook = filingBookData();
            for (int i = 0; i < books.size(); i++) {
                if (clientBook.equals(books.get(i)) && client.uuid.equals(books.get(i).getId())) {
                    System.out.println("Списибо что вернули книгу");
                    Date date = new Date();
                    Log.logs.add(new Log(books.get(i), client.uuid, TakeOrReturned.RETURNED.getOperation(), date));
                    books.get(i).setId(null);
                    break;
                } else System.out.println("Ничего найти не удалось, может вы не так заполнили данные книги?");
            }
        } else if (clientMyBook == 3) {
            int numberOfBooksTheClientHas = 0;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getId() != null) {
                    if (books.get(i).getId().equals(client.uuid)) {
                        numberOfBooksTheClientHas++;
                        System.out.println(
                                books.get(i).getAuthor() + " "
                                + books.get(i).getTitle() + " "
                                + books.get(i).getGenre().getTitleGenre());
                    }
                }
            }
            if (numberOfBooksTheClientHas == 0) {
                System.out.println("У вас пока нет книг взятых из библиотеки");
            }
        }
    }
}
