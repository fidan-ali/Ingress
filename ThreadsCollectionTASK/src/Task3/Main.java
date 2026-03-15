package Task3;

import jdk.jshell.spi.ExecutionControl;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        UserSystem system = new UserSystem();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter username: ");
            String username = scanner.nextLine();

            system.registerUser(username);
        }

    }
}
