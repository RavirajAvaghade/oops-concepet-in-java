class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // object
        s1.name = "Ravi";
        s1.age = 20;
        s1.display();
    }
}
