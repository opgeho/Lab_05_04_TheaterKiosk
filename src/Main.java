import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MIN_AGE = 21;
        int age = 0;
        String trash = "";

        System.out.println("What is your age? ");
        if(in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();
            if (age >= 21) {
                System.out.println("You get a wristband!");
            }
            else {
                System.out.println("You are not old enough for a wristband!");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("Your input " + trash + " is invalid! please restart the program and start again!");
        }
    }
}