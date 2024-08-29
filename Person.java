class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        new Person("jimin", 25).display();
        new Person("V", 30).display();
    }
}
