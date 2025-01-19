import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            // Read numbers from file
            File file = new File("Input.txt");
            Scanner scanner = new Scanner(file);

            // Read 4 numbers
            while (scanner.hasNextInt() && numbers.size() < 4) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();

            // Check if we got exactly 4 numbers
            if (numbers.size() != 4) {
                throw new IllegalArgumentException("File must contain exactly 4 numbers");
            }

            // Calculate sum and product
            int sum = 0;
            int product = 1;
            for (int num : numbers) {
                sum += num;
                product *= num;
            }

            // Append results to file
            FileWriter writer = new FileWriter("Input.txt", true);
            writer.write("\nSum: " + sum);
            writer.write("\nProduct: " + product);
            writer.close();

            System.out.println("Calculations completed successfully!");
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input.txt file not found!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}