/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Edgaras
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Your factorial result:");
        System.out.println(fakt(number));
    }
    public static int fakt(int a) {
        if (a>0) {
            return a * fakt(a-1);
        } else if(a<0) {
            return -1;
        }
        return 1;
    }   
}
