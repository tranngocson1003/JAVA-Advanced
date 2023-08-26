package principles.s;

public class Program {
    // S: Single responsibility
    //=> 1class chỉ nên c 1 trách nhiệm
    public static void main(String[] args) {

        Book book = new Book();
        BookPrinter printer = new BookPrinter();
        printer.printBook(book);

    }
}
