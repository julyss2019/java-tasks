public class Test {
    public static void main(String[] args) {
        makeEat(new Cat());
        makeEat(new Fish());
    }

    public static void makeEat(Animal animal) {
        animal.eat();

        if (animal instanceof Cat) {
            animal.shut();
        }
    }
}
