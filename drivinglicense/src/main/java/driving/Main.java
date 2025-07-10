package driving;
import driving.drvinglicenes;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        String tableName = "applicants";
        int choice;

        while (true) {
            System.out.println("\n--- Driving License Registration Menu ---");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Data");
            System.out.println("3. Update Data");
            System.out.println("4. Show Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                               + "name VARCHAR(100) NOT NULL, "
                               + "age INT NOT NULL, "
                               + "address VARCHAR(100), "
                               + "vehical VARCHAR(100), "
                               + "date VARCHAR(100))";
                    drvinglicenes.createTable(tableName, sql);
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String name = s.nextLine();

                    System.out.print("Enter age: ");
                    int age = s.nextInt();
                    s.nextLine(); // consume newline

                    System.out.print("Enter address: ");
                    String address = s.nextLine();

                    System.out.print("Enter vehicle: ");
                    String vehical = s.nextLine();

                    System.out.print("Enter date: ");
                    String date = s.nextLine();

                    drvinglicenes.insertData(tableName, name, age, address, vehical, date);
                    break;

                case 3:
                    System.out.print("Enter name to update: ");
                    String updateName = s.nextLine();

                    System.out.print("Enter new name: ");
                    name = s.nextLine();

                    System.out.print("Enter new age: ");
                    age = s.nextInt();
                    s.nextLine();

                    System.out.print("Enter new address: ");
                    address = s.nextLine();

                    System.out.print("Enter new vehicle: ");
                    vehical = s.nextLine();

                    System.out.print("Enter new date: ");
                    date = s.nextLine();

                    drvinglicenes.updateData(tableName, updateName, age, address, vehical, date);
                    break;

                case 4:
                    drvinglicenes.showTable(tableName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}



