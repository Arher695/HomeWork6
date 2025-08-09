package ru.netology;

public class Book {
    String title;
    int releaseDay;
    Author author;
    int pages;

    public Book(String title, int releaseDay, Author author, int pages) {
        this.title = title;
        this.releaseDay = releaseDay;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean match(String word) {
        return author.name.contains(word)
                || author.surname.contains(word)
                || title.contains(word);
    }

    public int estimatePrice() {
        //int price = (int) (3 * pages * (Math.sqrt(author.rating)));
        int price = (int) (Math.floor(3 * pages * (Math.sqrt(author.rating)))); //ответ одинаковый
        return Math.max(250, price);
    }

}
