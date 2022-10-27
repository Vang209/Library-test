package org.example;

import org.example.command.*;

import java.io.*;
import java.util.*;



public class Main implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner console = new Scanner(System.in);
        CommandAbstract listBook = new ListBook();
        CommandAbstract listGenre = new ListGenre();
        CommandAbstract listClient = new ListClient();
        CommandAbstract clientBook = new ClientBook();
        CommandAbstract listLog = new ListLog();

        System.out.println("Пожалуйста авторизуйтесь");
        Client.setClientNameForMyBooks(console.nextLine());

        Client client = new Client("");

        List<Book> books = new ArrayList<>();
        books.clear();
        Log.logs.clear();
        client.getClientList().clear();


        FileInputStream fis = new FileInputStream("Domain.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Domain domainRead = (Domain) ois.readObject();

        ois.close();
        fis.close();

        books = domainRead.bookList;
        client.setClientList(domainRead.clientList);
        Log.logs = domainRead.logList;
        client = new Client(Client.getClientNameForMyBooks());

        System.out.println("Пожалуйста ввидите номер команды");
        System.out.println("1. Начало работы");
        System.out.println("2. Завершение работы");
        int numberCommand = console.nextInt();


        if (numberCommand == 1) {
            numberCommand = 0;
            while (numberCommand != 1) {
                System.out.println("Что вы хотите?");
                System.out.println("1. Завершить работу");
                System.out.println("2. Список книг");
                System.out.println("3. Спиоск жанров");
                System.out.println("4. Список клиентов");
                System.out.println("5. Мои книги");
                System.out.println("6. Список всех операций");

                numberCommand = console.nextInt();

                if (numberCommand == 2) {
                    listBook.Command(books);
                } else if (numberCommand == 3) {
                    listGenre.Command();
                } else if (numberCommand == 4) {
                    listClient.Command();
                } else if (numberCommand == 5) {
                    clientBook.Command(books);
                } else if (numberCommand == 6) {
                    listLog.Command();
                }
            }

            FileOutputStream fos = new FileOutputStream("Domain.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Domain domain = new Domain(books, client.getClientList(), Log.logs);
            oos.writeObject(domain);
            oos.close();
            fos.close();

        }
    }
}