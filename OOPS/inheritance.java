package oops;

class shape {
    String color;

    public void color(String color) {
        System.out.println(this.color);
    }
}

class traingle extends shape {
    public void area(int l, int b) {
        System.out.println(0.5 * l * b);
    }
}

class circle extends shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

class copy extends shape {
    public void main() {
        System.out.println("hello");
    }
}

public class inheritance {
    public static void main(String[] args) {
        shape s1 = new shape();
        s1.color = "red";
        traingle t1 = new traingle();
        t1.area(9, 4);
        circle c1 = new circle();
        c1.area(3);
        copy c2 = new copy();
        c2.main();
    }

}
