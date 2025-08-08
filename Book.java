package ru.netology;

public class Book {
    public String title;
    public int releaseYear;
    public String authorName;
    public String authorSurname;
    public int pages;
    public int price;
    public int money;
    public int rating;


    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public int estimaitePrice() {
        int price = (int) Math.floor((int) (money * pages * Math.sqrt(rating)));
        if ((price) < 250) {
            return 250;
        } else if ((money * pages) > 250) {
            return price;
        }
        return price;
    }

    public int matchBook() {
        String str_Book = "Anton Pavlovich Chekhov's (1860-1904) play 'Uncle Vanya' was first published in 1897. " +
                "Once again, dear reader, we are presented " +
                "with a village life, an elite of nobles, bourgeois, intellectuals, " +
                "bankrupt landowners, and a variety of idlers. The main character of the play, " +
                "Ivan Petrovich Voynitsky, " +
                "is a 47-year-old man nicknamed ...";
        String wordMatchN = authorName;
        String wordMatchS = authorSurname;
        int count = 0;
        if (str_Book.contains(wordMatchN)) {
            System.out.println("Совпадения " + wordMatchN  + " найдены");
            count++;
        } else if (str_Book.contains(wordMatchS)) {
            System.out.println("Совпадения "  + wordMatchS + " найдены");
            count++;
        } else {
            System.out.println("Совпадения  не найдены");
        }
        return count;
    }
}
