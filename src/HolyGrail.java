

/*
primitives (holdover from C/C++):
int, double, boolean, char
Objects:
Starts with a capital letter
 */

// this imports a library when I compile this file
import java.util.Scanner;
/**
 * HolyGrail.java is the first lab I will write it is a simple
 * UI program that talks to the user.
 * 09/15/2020
 * @author jcochran
 */
public class HolyGrail {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("* A chat with the " +
                "bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.print("Question 1: What is your name? ");
        String name = in.nextLine();
        System.out.println(name);
    }
}

/*
        // name = input('What is your name: ') -- this is the Pythonic way
        System.out.print("What is your name: ");
        String name = in.nextLine();

        // print('Hello', name, 'nice to meet you.')
        System.out.println("Hello " + name + ", nice to meet you!");
        System.out.print("How old are you " + name + ": ");
        int age = in.nextInt();
        // age = int(input('How old are you', name + ': ')
        // numPets = int(input('How many pets do you own', name + ': ')
        System.out.print("How many pets do you own " + name + ": ");
        int numPets = in.nextInt();

        // print: "Hello _name_, nice to meet you!"
        // ask the user how old they are
        // ask the user how many pets the own
        // Print:
        // The user's name
        // "You are _age_ years old."
        // "You have _numPets_ pets."

        System.out.println(name + " great talking with you.");
        System.out.println(name + " you are " + age + " years old.");
        System.out.println(name + " you have " + numPets + " pets.");

        // print('hello world', end='')
        // print('my name is mud')
 */
