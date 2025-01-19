public class Calculator {
    // private member variable - only accessible within this class
    private int result;
    private int lastOperation; // changed to private since we're in single file

    // Constructor
    public Calculator() {
        this.result = 0;
        this.lastOperation = 0;
    }

    public void add(int a, int b) {
        result = a + b;
        updateLastOperation(1);
    }

    private void clearResult() { // changed to private since it's internal
        result = 0;
        lastOperation = 0;
    }

    private void updateLastOperation(int operationType) {
        this.lastOperation = operationType;
    }

    public void display() {
        System.out.println("The result is: " + result);
    }

    // Adding main method here
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 10);
        calculator.display();
    }
}