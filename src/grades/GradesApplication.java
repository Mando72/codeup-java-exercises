package grades;

import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {
    // method
  public static void CommandLineGame(HashMap<String, Student> students){
      int total = 0;

      System.out.println("Welcome!");
      System.out.println("Here are the students from GitHub.");

      do {
          System.out.println(students.keySet());
          System.out.println("What student would you like to see more information on? \n" +
                  "You can also type'all' to see all the students and their grades, or 'overall'" +
                  "to see the classes overall grade average");

          Scanner scan = new Scanner(System.in);
          String userChoice = scan.nextLine();

          if (userChoice.equalsIgnoreCase("all")) {
              for (String student : students.keySet()) {
                  System.out.println(students.get(student).getName() + students.get(student).getGrades());

              }
          }

          if (userChoice.equalsIgnoreCase("Overall")) {
              for (String student : students.keySet()) {
                  total += students.get(student).getGradeAverage();

              }

              System.out.println("The class overall average is " + total / students.size());
              System.out.println("Would you like to see another student? [y/n]");
              String keepGoing = scan.nextLine();

              if (keepGoing.equalsIgnoreCase("n")) {
                  System.out.println("Thanks for using the grading application!");
                  return;
              }

          } else if (students.containsKey(userChoice)) {
              System.out.println("That student name is " + students.get(userChoice).getName());
              System.out.println("Here are the students grades " + students.get(userChoice).getGrades());
              System.out.println("Would you like to see another student? [y/n]");
              String keepGoing = scan.nextLine();
              if (keepGoing.equalsIgnoreCase("n")) {
                  System.out.println("Thanks for using the grading application!");
                  return;
              }

          } else {
              System.out.println("Sorry, that student doesn't exist!");
              System.out.println("Would you like to see another student? [y/n]");
              String keepGoing = scan.nextLine();
              if (keepGoing.equalsIgnoreCase("n")) {
                  System.out.println("Thanks for using the grading application!");
                  return;
              }
          }

      } while(true);
  }



    public static void main(String[] args){

        HashMap<String, Student> students = new HashMap<>();

        Student st1 = new Student("Ray");
        Student st2 = new Student("Sandra");
        Student st3 = new Student("Rob");
        Student st4 = new Student("Denise");

        st1.addGrade(99);
        st1.addGrade(89);
        st1.addGrade(88);
        st2.addGrade(87);
        st2.addGrade(90);
        st2.addGrade(91);
        st3.addGrade(76);
        st3.addGrade(74);
        st3.addGrade(70);
        st4.addGrade(65);
        st4.addGrade(99);
        st4.addGrade(83);

        students.put("DarthVader", st1);
        students.put("Sharptooth", st2);
        students.put("Sidewinder", st3);
        students.put("SledgeHammer", st4);

        CommandLineGame(students);


    }
}
