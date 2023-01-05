abstract class animal {
    animal() {
        System.out.println("constructor");
    }

    abstract void walk();
}

class Horse extends animal {
    Horse() {
        System.out.println("walk");
    }

    public void walk() {
        System.out.println("bark");
    }
}

class cat extends animal {
    cat() {
        System.out.println("cat");
    }

    public void walk() {
        System.out.println("hello");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        cat c = new cat();
        c.walk();

    }
}
