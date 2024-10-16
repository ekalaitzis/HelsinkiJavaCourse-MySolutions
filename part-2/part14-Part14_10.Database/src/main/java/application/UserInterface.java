package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            if (command.equals("1")) {
                System.out.println("Listing the database contents");
                System.out.println(this.database.list());

            }
            if (command.equals("2")) {
                System.out.println("Adding a new todo\n"
                        + "Enter name\n");
//                code
                String toDoName = scanner.nextLine();

                System.out.println("Enter description");
//                code  
                String toDoDescription = scanner.nextLine();
                int todos = this.database.list().size();
                Todo todo = new Todo(todos, toDoName, toDoDescription, Boolean.FALSE);
                this.database.add(todo);
            }
            if (command.equals("3")) {
                System.out.println("Which todo should be marked as done (give the id)?");
                int toDoID = scanner.nextInt();
                this.database.markAsDone(toDoID);
            }
            if (command.equals("4")) {
                System.out.println("Which todo should be removed (give the id)?");
                int toDoRemove = scanner.nextInt();
                this.database.remove(toDoRemove);
            }

        }

        System.out.println("Thank you!");
    }

}
