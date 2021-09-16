import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("hello Welcome to rock, paper, scissors.");
        System.out.println("press 1 for singleplayer");
        System.out.println("press 2 for Multiplayer");
        int pressANumberToPlay = scanner.nextInt();


        int number2 = 2;
        if (pressANumberToPlay == 1) {
         singlePlayer();
        } else {
            multiplayer();
        }


    }

    public static void singlePlayer() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("you chose SinglePlayer");
        int R = 1;
        int P = 2;
        int S = 3;

        int usersInput;
        int computersInput;

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        usersInput = scanner.nextInt();

        computersInput = random.nextInt(3);

        System.out.println("User chose " + usersInput);
        System.out.println("Computer chose " + computersInput);

        if (usersInput == computersInput) {
            System.out.println("its a tie!!");
        } else if ((usersInput == R && computersInput == S) || (usersInput == S && computersInput == P) || (usersInput == P && computersInput == R)) {
            System.out.println("User Wins!!!!");
        } else {
            System.out.println("Computer Wins!!!");
        }


    }

    public static void multiplayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("you chose multiPlayer");
        System.out.println("so, user 1 Rock. Paper. scissors.");

        int R = 1;
        int P = 2;
        int S = 3;

        int usersInput;
        int user2input;


        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        usersInput = scanner.nextInt();

        System.out.println("user 2 choose");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        user2input = scanner.nextInt();



        System.out.println("User chose " + usersInput);
        System.out.println("Computer chose " + user2input);

        if (usersInput == user2input) {
            System.out.println("its a tie!!");
        } else if ((usersInput == R && user2input == S) || (usersInput == S && user2input == P) || (usersInput == P && user2input == R)) {
            System.out.println("User Wins!!!!");
        } else {
            System.out.println("User 2 Wins!!!");
        }
    }
}


