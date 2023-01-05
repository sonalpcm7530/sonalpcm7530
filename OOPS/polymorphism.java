package oops;

//compile time
class ply {
    String name;
    int age;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + "" + age);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        ply o1 = new ply();
        o1.printinfo("om");
        o1.printinfo("Rahul", 32);
        o1.printinfo(31);
    }

}
