package ioc;

public class Service implements IService{
    private IRepository repository ;

    public Service(IRepository repository) {
        this.repository = repository;
    }

    public void setRepository(IRepository repository) {
        this.repository = repository;
    }
}
