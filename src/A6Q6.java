
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert scanner
        Scanner input = new Scanner(System.in);

        //ask the user how many students are in the class       
        System.out.println("Enter the number of students in the class: ");

        //input the number of students in the class       
        int students = input.nextInt();

        //ask the user to enter the marks
        System.out.println("Enter each individuals percentage: ");

        //input the marks
        double[] marks = new double[students];


        //loop until all marks are inserted
        for (int i = 0; i < marks.length; i++) {

            //insert the marks
            marks[i] = input.nextDouble();
        }

        //loop 10 times
        for (int i = 0; i < marks.length; i++) {

            //loop until all the numbers are in their rightful places
            for (int j = 0; j < (marks.length - 1); j++) {

                //put the numbers in order if array 1 is greater
                if (marks[j] < marks[j + 1]) {

                    //make a temporary integer
                    double temp = marks[j + 1];

                    //swapping the numbers
                    marks[j + 1] = marks[j];
                    //switch the places of array 1
                    marks[j] = temp;
                }
            }
        }
        double min = marks.length - 1;
    }
}
