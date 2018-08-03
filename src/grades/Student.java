package grades;

import java.util.ArrayList;

public class Student {
    // setting properties/ declaring variables
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();




    // this is the constuctor that sets
    //name property & initializes the grades prop as an empty list.
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
        // these are the methods of this class
        public String getName(){
        return name;
        }

        public void addGrade(int grade){
        grades.add(grade);
        }

         public ArrayList<Integer> getGrades(){
            return grades;
         }


        public double getGradeAverage(){
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }

        return sum / grades.size();

        }


        // the main method for tetsting
//    public static void main(String[] args){
//
//        // defining a new variable
//        Student st1 = new Student("Sam");
//
//        // objects
//        st1.addGrade(80);
//        st1.addGrade(83);
//        st1.addGrade(88);
//        st1.addGrade(79);
//        st1.addGrade(30);
//        st1.addGrade(81);
//
//        // this runs and returns the average of grades
//        System.out.println(st1.getGradeAverage());



    }


