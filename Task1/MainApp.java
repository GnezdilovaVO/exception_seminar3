package Homework.Task1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create password: ");
        String password = scanner.nextLine();
        scanner.close();
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        try {
            passwordVerifier.checkAll(password);
            System.out.println(password + "All is Ok!=)");
        } catch (PasswordCapsLookException e) {
            System.out.println(e.getMessage());
        } catch (PasswordLengthException e) {
            System.out.println(e.getMessage());
        } catch (PasswordIsDigritException e) {
            System.out.println(e.getMessage());
        }

    }
}
