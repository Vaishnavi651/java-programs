import java.util.Scanner;

class FirstLetterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        if (!name.isEmpty()) {
            
            System.out.println("First letter of your name: " + name.charAt(0));
        } else {
            System.out.println("No name entered.");
        }

        scanner.close();
    }
}
