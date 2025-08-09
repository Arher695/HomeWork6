package ru.netology;

public class Librari {
    public static void main(String[] args) {
        Book book = new Book("Uncle Vanya", 1987,
                new Author("Антон", "Чехов", 5), 38);
        System.out.println("Эта книга большая? " + book.isBig());
        System.out.println("Совпадения по имени: " + book.match("Vanya"));
        System.out.println("Совпадение по фамилии: " + book.match("Антон"));
        System.out.println("Стоимость книги - " + book.estimatePrice() + " рублей");

    }
}
