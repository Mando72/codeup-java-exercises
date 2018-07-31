import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {


            int i = 5;

            while(i <= 15) {
            System.out.print(i);
                System.out.print(" ");
            i+= 1;
        }


       int i = 0;


        do {
            System.out.println(i);
            i += 2;

        } while(i <= 100);

       int i = 100;

       do {
         System.out.println(i);
         i -= 5;
       } while (i >= -10);


            long i = 2;

            do {
                System.out.println(i);
                i *= i;
            } while (i < 65536);


        for (int i = 1; i <= 100; i += 1) {
            if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

    }

    Scanner sc = new Scanner(System.in);
    boolean userContinues = true;

         System.out.print("Would you like to enter another number(y,n)?");
    int userInt = sc.nextInt();
         System.out.println("Here is your table");
         System.out.println();
         System.out.println("number | squared | cubed");
         System.out.println("====== | ======= | =====");
            for(
    int i = 1;
    i <=userInt;i +=1)

    {
        System.out.printf("%-7d", i);
        System.out.print("|");
        System.out.printf("%-8d", i * i);
        System.out.print("|");
        System.out.printf("%-9d", i * i * i);
        System.out.println();
    }
            System.out.print("Would you like to enter another number(y,n)?");
    String userResponse = sc.next();

            if(!userResponse.equalsIgnoreCase("y")){

        userContinues = false;
    }

  } while(userContinues);

                Scanner sc = new Scanner(System.in);
                boolean anotherGrade = true;
                do {
                    System.out.print("Please enter a numerical grade from 0 to 100");

                    int numericGrade = sc.nextInt();

                    if (numericGrade >= 88) {
                        System.out.println("A");
                    } else if (numericGrade >= 80) {
                        System.out.println("B");
                    } else if (numericGrade >= 67) {
                        System.out.println("C");
                    } else if (numericGrade >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("F");
                    }
                    System.out.print("Do you want to continue(y,n)?");
                    String userResponse = sc.next();

                    If(!userResponse.equalsIgnoreCase("y")); {
                        anotherGrade = false;
                }

            } while (anotherGrade);

        }

    private static void If(boolean y) {
    }
}