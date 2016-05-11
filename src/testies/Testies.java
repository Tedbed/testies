/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testies;

import java.util.Scanner;

/**
 *
 * @author Teddy
 */
public class Testies {

    public static String question;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        question = "0";
        while (true) {
            switch (question) //If question is equal to...
            {
                case "0": //this....right here
                    System.out.println("There was a boy named mike \n\nHow old is this boy you ask?\n.\n.\n.\n.\nOld enough. Wbu?\n");
                    question = "1";
                    break;

                case "1":
                    String name;
                    name = in.next();
                    question = "1A";
                    break;

                case "1A":
                    System.out.println("\n\nR u sure u r really that old??\n[1]Yes\n[2]No");
                    question = "2";
                    break;

                case "2":
                    switch (in.next()) {
                        case "1":
                            System.out.println("same dude lmao nice");
                            question = "2A";
                            break;
                        case "2":
                            question = "0";
                            break;
                    }
                    break;
                case "2A":
                
                    break;
                
            }

        }
    }
}
