import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // String name = in.next();
        String name = args[0];
        System.out.println("Hello " + name + "! Welcome to my first docker container");

    }
}