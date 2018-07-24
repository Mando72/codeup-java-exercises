public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");


        int myFavoriteNumber = 6500;
        System.out.println(myFavoriteNumber);

        String myString = "I like java!";
        System.out.println(myString);

        char myChara = 'M';
        System.out.println(myChara);


        double bestPrice = 3.14159;
        System.out.println(bestPrice);

//        long myNumber = 123;
//        System.out.println(myNumber);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        int x = 4;
        x = x += 5;
        System.out.println(x);

        int d = 3;
        int y = 4;
        y = y *= d;
        System.out.println(y);

        int z = 10;
        int v = 2;
        z = z /= v;
        v = v -= z;
        System.out.println(z);
        System.out.println(v);



    }
}

