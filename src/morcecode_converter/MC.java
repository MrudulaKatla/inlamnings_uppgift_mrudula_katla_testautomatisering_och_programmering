package morcecode_converter;

import java.util.Scanner;

public class MC { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Convert myConvert = new Convert();
    int number = 0;
    try {
        System.out.println("If you would like to convert english to morsecode press 1, otherwise press 2");
        number = Integer.parseInt(scan.nextLine());
    } catch (Exception N) {
    }
    String text;
    String mc;
    if (number == 1) {
        System.out.println("Enter english text in capital letters: ");
        text = scan.nextLine();
        String text_mc = myConvert.getMC(text);
        System.out.println("Morse code is: " + text_mc);
    } else if (number == 2) {
        System.out.println("Enter morsecode: ");
        mc = scan.nextLine();
        System.out.print("Text is: " + myConvert.getEnglish(mc));
    } else {
        System.out.println("Wrong enter!");
    }
}

}
