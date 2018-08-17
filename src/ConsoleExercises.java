import java.util.Scanner;

public class consoleExercises {
    public static void main(String[] args) {
//
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//         What happens if you input something that is not an integer?Scanner sc = new Scanner(System.in);

        int myInt = 75;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number?");
        myInt = sc.nextInt();
//
        System.out.println("Your number is " + " " + myInt);
////
//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
//////


        System.out.println("Give me the first word.");
        String word1 = sc.nextLine();
        System.out.println("Give me the second word.");
        String word2 = sc.nextLine();
        System.out.println("Give me the third word.");
        String word3 = sc.nextLine();
        System.out.printf("Your word %s %s %s",
                word1, word2, word3);


//          Prompt a user to enter a sentence, then store that sentence in a String variable
// using the .next method, then display that sentence back to the user.
//          do you capture all of the words?

        System.out.println("Give me a sentence");
        String sentence = sc.nextLine();

        System.out.println(sentence);
////
//           Rewrite the above example using the .nextLine method.
//           Calculate the perimeter and area of Codeup's classrooms
//           Prompt the user to enter values of length and width of the classroom.
//          Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//          Assume that the rooms are perfect rectangles.
//          Assume that the user will enter valid numeric data for length and width.

          System.out.println("Give me the length");
          String length = sc.nextLine();
          System.out.println("Give me the width");
          String width = sc.nextLine();

          double area = Double.parseDouble(length) * Double.parseDouble(width);
          System.out.println(area + " = "+length+" x "+width);


          double perimeter = (2 * Double.parseDouble(length)) + (2 * Double.parseDouble(width));

          System.out.println(perimeter + " = 2x"+length+" + 2x"+width);
            
            
            
            
            
            
            




    }
 }