import java.util.Scanner;

/**
 * SimpleIOMath is a simple class that takes input/output from
 * a user, stores that information in class variables and then
 * defines a few helper methods.
 * @version 09.24.2020
 * @author julian cochran
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private static int favNumber;

    /**
     * Ask the user for some info. That's about it.
     */
    public void promptUser()    {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        Scanner sassan = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = sassan.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = sassan.nextInt();
    }
    /**
     * Print the user's supplied info. That's about it.
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your age is: " + age);
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
    }

    private int smallestPrimeFactor(int age)    {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61};
        for(int factor : primes)    {
            if(age % factor == 0) {
                return factor;
            }
        }
        return age;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args Command line arguments, if needed.
     */
    public static void main(String[] args)  {
        SimpleIOMath obj = new SimpleIOMath();
        obj.promptUser();
        obj.printInfo();

    }
}
