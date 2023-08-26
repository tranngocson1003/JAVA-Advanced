package principles.o;

public class Program {

    // O: Open / Closed
    // => mở rộng mà không cần code cũ

    // Có 2 cách tiếp cận
    // 1. Kế thừa lớp cần mở rộng
    // 2. Chứa lớp cần mở rộng
    public static void main(String[] args) {
        PrinterV2 printer = new PrinterV2();
        printer.print();
    }
}
