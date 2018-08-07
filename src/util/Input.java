package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    // Original version with params
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    // Another version without params
    public String getString(){
        return this.sc.nextLine().toLowerCase().trim();
    }

    // Yes/No reuses some code from getString
    public boolean yesNo(){
        String result = this.getString("Type yes or no (y/n)");
        return (result.equals("y") || result.equals("yes"));
    }

    public int getInt(int min, int max){
        int userInput = Integer.parseInt(this.getString("Give me a number between " + min + " and " + max));
        if(userInput < min || userInput > max){
            System.err.println("Number our of range");
            getInt(min, max);
        }
        return userInput;
    }

    public int getInt(String prompt){
         System.out.println(prompt);
         return getInt();
    }

    public int getInt(){
        try {
            return Integer.parseInt(this.getString("Give me a number"));
        }catch(NumberFormatException e){
            System.out.println("Not a number, try again...");
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double userInput = Double.parseDouble(this.getString("Give me a decimal number between " + min + " and " + max));
        if(userInput < min || userInput > max){
            System.err.println("Decimal number out of range");
            userInput = getDouble(min, max);
        }
        return userInput;
    }

        //getDouble("enter a number with decimal?")
        //sout
        //return method()

    public double getDouble(String prompt) {
        System.out.println(prompt);
         return getDouble();
    }

    public double getDouble(){
        //return a number
        // = "a"?
        //NumberFormatException
        try{
            return Double.parseDouble(this.getString("Give me a decimal number"));
        }catch(NumberFormatException e){
            System.out.println("Not a number, try again...");
            return getDouble();
        }
    }

}
