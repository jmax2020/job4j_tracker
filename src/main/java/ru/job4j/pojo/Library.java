package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Buratino", 15);
        Book two = new Book("Massive", 999);
        Book tree = new Book("Don Kikhot", 156);
        Book four = new Book("Matrix", 548);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = tree;
        books[3] = four;
        books[0].setName("Clean code");
        System.out.println("List of books:");
        for(int i =0; i < books.length; i++) {
            System.out.println("Book №" + (i + 1) + ": name " + books[i].getName() + ", number of pages is " + books[i].getNumberPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println(System.lineSeparator() + "After change 1 and 4 books");
        for(int i =0; i < books.length; i++) {
            System.out.println("Book №" + (i + 1) + ": name " + books[i].getName() + ", number of pages is " + books[i].getNumberPages());
        }
        for(int i =0; i < books.length; i++) {
            if(books[i].getName().equals("Clean code")) {
                System.out.println(System.lineSeparator() + "The book was found: " + books[i].getName() + ", " + books[i].getNumberPages() + " pages");
            }
        }
    }
}
