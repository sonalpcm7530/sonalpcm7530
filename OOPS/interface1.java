package oops;

interface animal {
    int eyes = 3;

    public void walk();
}

// multiple inheritance
interface herbi {
    // public void beep();

}

class Cow implements animal, herbi {
    public void walk() {
        System.out.println("hello");
    }
}

class Man implements animal {
    public void walk() {
        System.out.println("multiple");
    }

}

public class interface1 {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        // c1.beep();
        c1.walk();
        Man m1 = new Man();
        m1.walk();
    }
}
