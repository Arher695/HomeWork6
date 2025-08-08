package ru.netology;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book();
        book.title = "Uncle Vanya";
        book.releaseYear = 1897;
        book.authorName = "Anton";
        book.authorSurname = "Chekhov";
        book.pages = 38;
        book.money  = 3;
        book.rating = 5;
        book.price = book.estimaitePrice();
        System.out.println("Стоимость книги: " + book.estimaitePrice() + " рублей");
        System.out.println("Эта книга большая? " + book.isBig());
        System.out.println(book.matchBook());

    }
}