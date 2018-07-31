package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();

        System.out.println(input.getString());

        System.out.println(input.getString("GIVE ME SOMETHING"));

        System.out.println(input.yesNo());
    }
}
