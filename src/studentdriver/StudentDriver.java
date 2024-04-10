/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

import java.io.*;
import java.util.*;

public class StudentDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //create the array of students
        StudentFees[] students = new StudentFees[12];
        File inputFile = new File("input.csv");

        //get number of students from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of UG Students: ");
        int ugStudent = input.nextInt();
        System.out.print("Enter the no of Graduate Students: ");
        int gradStudent = input.nextInt();
        System.out.print("Enter the no of Online Students: ");
        int onlineStudent = input.nextInt();

        System.out.println("\n**********Undergraduate students list**********");
        for (StudentFees s : students) {
            if (s instanceof UGStudent) {
                System.out.println(s);
            }
        }
        System.out.println("\n**********Graduate students list**********");
        for (StudentFees s : students) {
            if (s instanceof GraduateStudent) {
                System.out.println(s);
            }
        }
        System.out.println("\n**********Online students list**********");
        for (StudentFees s : students) {
            if (s instanceof OnlineStudent) {
                System.out.println(s);
            }
        }
    }

}
