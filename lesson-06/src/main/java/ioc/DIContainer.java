package ioc;

public class DIContainer {
    public IRepository provideRepository(){
        return new RepositoryV2();
    }

    public IService provideService(){
        return new Service(provideRepository());
    }

}
