
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shyam
 */
public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);

        String str = read.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }

        System.out.println("Reversed string is:");

        System.out.println(reverse);

    }

}

