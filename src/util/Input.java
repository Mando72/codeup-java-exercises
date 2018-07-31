package util;

import java.util.Scanner;


public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString(String prompt) {
        prompt = (prompt.isEmpty()) ? "Type: " : prompt;
        System.out.println(prompt);
        return this.sc.nextLine().toLowerCase().trim();

    }

    public boolean yesNo() {
        System.out.println("Type yes or no (y/n)");
        String result = this.getString("Type yes or no (y/n)");
        return (result.equals("y") || result.equals("yes"));
    }

}
