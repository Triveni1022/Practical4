public class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void add(int a, int b) {
        result = a + b;
    }

    public void display() {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Example operations
        System.out.println("Performing addition: 5 + 3");
        calc.add(5, 3);
        calc.display();
    }
}