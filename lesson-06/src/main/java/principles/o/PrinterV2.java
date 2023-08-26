package principles.o;

public class PrinterV2 {

    private PrinterV1 v1 = new PrinterV1();
    public void print(){

        v1.print();
        System.out.println("Print version 2");
    }
}
