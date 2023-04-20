import java.util.ArrayList;

public class User {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("멍이"));
        animals.add(new Cat("야옹이"));
        animals.add(new Dog("댕댕이"));
        animals.add(new TigerAdapter("호랑이"));

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}
