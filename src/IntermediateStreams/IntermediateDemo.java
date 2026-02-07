package src.IntermediateStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[] args) {
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

        System.out.println("<--------First operation -------->");
        //1. Filtering: Books cheaper than $20
        Stream<Book> filteredBooks = books.stream()
                .filter(book -> book.price < 20);
        filteredBooks.forEach(System.out::println);

        System.out.println();
        System.out.println("<--------Second operation -------->");
        //2. Mapping: Convert book titles to uppercase
        Stream<String> upperCaseTitles = books.stream()
                .map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);

        System.out.println();
        System.out.println("<--------Third operation -------->");
        //3. Sorting: Books by publication date
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);

        System.out.println();
        System.out.println("<--------Fourth operation -------->");
        //4. Distinct: Remove duplicate titles
        Stream<Book> uniqueBooks = books.stream().distinct();
        uniqueBooks.forEach(System.out::println);

        System.out.println();
        System.out.println("<--------Fifth operation -------->");
        //5. Limit: Display only the first 3 books
        Stream<Book> firstThreeBooks = books.stream()
                .limit(3);
        firstThreeBooks.forEach(System.out::println);

        System.out.println();
        System.out.println("<--------Sixth operation -------->");
        //6. Skip: Skip the first 2 books
        Stream<Book> afterSkippingTwo = books.stream()
                .skip(2);
        afterSkippingTwo.forEach(System.out::println);



    }

//    static Predicate<Book> predicate = new Predicate<Book>() {
//        @Override
//        public boolean test(Book book) {
//            return book.price < 20;
//        }
//    };
}
