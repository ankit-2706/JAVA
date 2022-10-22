package Ankit_Bro;

import  java.util.Scanner;
// 'Scanner' class is used to take the input from the user..
// 'Scanner' class is present in 'util' package.
public class input {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("What is your name?");
        String name= input.nextLine();
        System.out.println("Hello"+" "+" "+ name);
        System.out.println("How old are you?");
        int age= input.nextInt();
        System.out.println("you are" + " "+age+" "+"years old");
        input.nextLine();
        System.out.println("What is your favourite food?");
        String food= input.nextLine();
        System.out.println("you like" +" "+" "+ food );

    }
}


