public class Main {

    public static void main(String[] args) {


        PersonQueue queue = new PersonQueue();

        queue.enqueue(new Person("Cameron", "123"));
        queue.enqueue(new Person("Hello", "3333"));

        queue.showAll();
    }
}
