import java.io.*;

public class FileConverter {
    public void copyUpper() {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Open the input file
            reader = new BufferedReader(new FileReader("FIRST.TXT"));
            // Create/Open the output file
            writer = new BufferedWriter(new FileWriter("SECOND.TXT"));

            String line;
            // Read each line, convert to uppercase, and write to output file
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }

            System.out.println("File successfully converted to uppercase!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file FIRST.TXT not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred while reading/writing the file!");
            e.printStackTrace();
        } finally {
            try {
                // Close the readers and writers if they were opened
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error occurred while closing the files!");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FileConverter converter = new FileConverter();
        converter.copyUpper();
    }
}