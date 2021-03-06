
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many people are in the group
        System.out.println("How many people are there?");

        //input the number of people that are in the group
        int people = input.nextInt();

        //ask the user to enter the heights
        System.out.println("Enter the heights of each individual in centimetres: ");

        //create a list with the number of people in the group
        double[] height = new double[people];

        //loop for inputting the marks
        for (int i = 0; i < height.length; i++) {
            //inputting the marks
            height[i] = input.nextDouble();
        }


        //getting the sum of the heights
        double sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum = sum + height[i];
        }

        //finding the average
        double average = (sum / people);
        average = Math.round(average * 100.0) / 100.0;

        //outputting the class average
        System.out.println("The average height in the group is " + average + " cm.");

        for (int i = 0; i < height.length; i++) {
            if (height[i] > average) {

                //finding people who are above average height
                System.out.println("People who are above average height are " + height[i] + " cm.");
            }
        }
    }
}

