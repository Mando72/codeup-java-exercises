import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
        int x = 12;
        int y = 6;


        // testing exercise #1
        int sum = addNums(x, y);
        System.out.println(x + " " + "+ " + y + " " + "is: " + sum);
        int num = subNums(x, y);
        System.out.println(x + " " + "- " + y + " " + "is: " + num);
        int xnum = multiNums(x, y);
        System.out.println(x + " " + "* " + y + " " + "is: " + xnum);
        int dnum = divNums(x, y);
        System.out.println(x + " " + "/ " + y + " " + "is: " + dnum);
        System.out.println(modNums(12,6));
//
//        // testing exercise #2
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your integer is: " + userInput);

        // testing exercise #3
        Scanner sc = new Scanner(System.in);
        userInteractionFactorial(sc);

        // testing exercise #4

        rollDiceGame(sc);


    }

    public static int addNums(int a, int b) {
        return a + b;
    }

    public static int subNums(int c, int d) {
        return c - d;
    }

    public static int multiNums(int e, int f) {
        return e * f;
    }

    public static int divNums(int g, int h) {
        return g / h;
    }

    public static int modNums(int i, int j) { return i % j ; }





    private static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }

        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }

    public static long calculateFactorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void userInteractionFactorial(Scanner sc) {
        boolean willContinue;
        String userChoice;
        do {
            System.out.println("Please enter an integer from 1 to 12");
            int userInt = getInteger(1, 12);
            System.out.println(calculateFactorial(userInt));
            do {
                System.out.println("Do you wish to continue? [y/n]: ");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
            willContinue = userChoice.equalsIgnoreCase("y");
        } while (willContinue);
    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }



}





