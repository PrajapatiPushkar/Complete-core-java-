package src.IntermediateStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookStoreChallenge {
    public static void main(String[] args) {
        /*
    -  Discounted Books: The bookstore is planning a sale.
         Identify all books that are priced over $20. Display these books.
    -  Classics Collection: The bookstore is launching a classics collection.
          Identify and display books that were published before the year 2000.
    - Upcoming Titles: Generate a list of future book titles for the next year
           by adding the suffix "(Coming Soon)" to all the current titles.
    - Sort by Price: The bookstore wants to print price tags for all the books.
          Display the books sorted by their prices in ascending order.
    - Rare Books: The bookstore believes there might be rare books in the collection.
           A rare book is one where the title has more than 20 characters.
             Identify and display these books.
        */
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", 1925, 15.99, "Fiction"),
                new Book("A Brief History of Time", 1988, 18.50, "Science"),
                new Book("The Hobbit", 1937, 12.00, "Fantasy"),
                new Book("1984", 1949, 10.99, "Dystopian"),
                new Book("Clean Code", 2008, 45.00, "Technology"),
                new Book("The Silent Patient", 2019, 14.20, "Thriller"),
                new Book("Sapiens", 2011, 22.00, "History"),
                new Book("The Alchemist", 1988, 13.50, "Adventure"),
                new Book("Artificial Intelligence: A Modern Approach", 2020, 85.00, "Technology"),
                new Book("The Catcher in the Rye", 1951, 11.25, "Fiction")
        );

        // Identify all books that are priced over $20.
        System.out.println("===========================");
        System.out.println("Identify all books that are priced over $20.");
        System.out.println("============================");
        books.stream()
                .filter(book -> book.price > 20)
                .forEach(System.out::println);

        //Identify and display books that were published before the year 2000.
        System.out.println("===========================");
        System.out.println("Identify and display books that were published before the year 2000");
        System.out.println("============================");
        books.stream()
                .filter(book -> book.publicationYear < 2000)
                .forEach(System.out::println);

        //adding the suffix "(Coming Soon)" to all the current titles.
        System.out.println("===========================");
        System.out.println("adding the suffix \"(Coming Soon)\" to all the current titles.");
        System.out.println("============================");
        books.stream()
                .map(book -> book.title + "(Coming Soon)")
                .forEach(System.out::println);

        // Display the books sorted by their prices in ascending order.
        System.out.println("===========================");
        System.out.println(" Display the books sorted by their prices in ascending order.");
        System.out.println("============================");
        books.stream()
                .sorted(Comparator.comparingDouble(book -> book.price))
                .forEach(System.out::println);

        //A rare book is one where the title has more than 20 characters.
        System.out.println("===========================");
        System.out.println("A rare book is one where the title has more than 20 characters.");
        System.out.println("============================");
        books.stream()
                .filter(book -> book.title.length() > 20)
                .forEach(System.out::println);
    }
}
