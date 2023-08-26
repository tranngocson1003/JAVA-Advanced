package principles.l;

public class Program {
    // L: liskov substitution
    // => Class con có thể thay thế Clas cha
    public static void main(String[] args) {
        fly(new Bird());
    //  fly(new Dog());
    }

    public static void fly(Flyable flyable){
        flyable.fly();
    }
}
