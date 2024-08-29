class MethodOverloadingDemo {

    
    void display(int num) {
        System.out.println("int: " + num);
    }

    void display(String str) {
        System.out.println("String: " + str);
    }

    void display(int num1, int num2) {
        System.out.println("int, int: " + num1 + ", " + num2);
    }

    void display(int num, String str) {
        System.out.println("int, String: " + num + ", " + str);
    }

    void display(double num) {
        System.out.println("double: " + num);
    }

    void display(double num, String str) {
        System.out.println("double, String: " + num + ", " + str);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

    
        demo.display(10);
        demo.display("Hello");
        demo.display(10, 20);
        demo.display(10, "Overloading");
        demo.display(10.5);
        demo.display(10.5, "Method Overloading");
    }
}