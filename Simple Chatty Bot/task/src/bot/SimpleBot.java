package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {

        System.out.println("Hello! My name is Spyder.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("What a great name you have, "+s+"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remainder3 = scan.nextInt();
        int remainder5 = scan.nextInt();
        int remainder7 = scan.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is "+age+"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int count = scan.nextInt();
        for(int i=0;i<=count;i++) {
            System.out.println(i+"!");
        }
        System.out.println("Completed, have a nice day!");
    }
}
