import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class One {

    void writeToFile(String fileName, String name) throws IOException {
        FileWriter fw = new FileWriter(fileName + ".txt");
        fw.write(name);
        fw.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter text to write: ");
        String name = sc.nextLine();

        One obj = new One();

        try {
            obj.writeToFile(fileName, name);
            System.out.println("Data written successfully in " + fileName + ".txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}