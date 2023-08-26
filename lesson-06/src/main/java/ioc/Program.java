package ioc;

public class Program {
    // inversion of control
    // Ioc: quản lý các đối tượng phụ thuộc
    // Dependency Injection
    // 2 cach tiep can
    public static void main(String[] args) {
        DIContainer container = new DIContainer();
        IService service = container.provideService();

    }
}
