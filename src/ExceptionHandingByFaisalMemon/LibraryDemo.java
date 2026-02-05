package src.ExceptionHandingByFaisalMemon;

class Library{
    int availableBooks = 3;

    public void borrowBook(int bookRequested) {
        try {
            int[] books = {101, 102, 103};
            System.out.println("Book Requested : " + books[bookRequested]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occur, you requested a book that not exits ");
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }finally {
            System.out.println("Finally block");
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(5);

    }
}
