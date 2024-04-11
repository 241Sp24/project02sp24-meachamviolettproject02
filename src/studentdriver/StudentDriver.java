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
        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of UG Students: ");
        int ugStudent = input.nextInt();
        System.out.print("Enter the no of Graduate Students: ");
        int gradStudent = input.nextInt();
        System.out.print("Enter the no of Online Students: ");
        int onlineStudent = input.nextInt();
        
        //create the array of students
        StudentFees[] students = new StudentFees[ugStudent + gradStudent + onlineStudent];
        File inputFile = new File("input.csv");
        Scanner inputfile = new Scanner(inputFile);
        
        //variable for index
        int num = 0;

        //get number of students from the user
        while (inputfile.hasNext()) {
           String info = input.nextLine();
           String[] infoArray = info.split(",");
           int studID = Integer.parseInt(infoArray[0]);
           String studName = infoArray[1];
           boolean isEnrolled = Boolean.parseBoolean(infoArray[2]);
           
           if(studID >= 100 && studID < 199){
               int coursesEnrolled = Integer.parseInt(infoArray[3]);
               boolean hasScholarship = Boolean.parseBoolean(infoArray[4]);
               double scholarshipAmount = Double.parseDouble(infoArray[5]);
               students[num] = new UGStudent(studName, studID, isEnrolled, hasScholarship, scholarshipAmount, coursesEnrolled);
           }
           else if(studID >= 200 && studID < 299){
               int coursesEnrolled = Integer.parseInt(infoArray[3]);
               boolean isGradAssistant = Boolean.parseBoolean(infoArray[4]);
               String gradAssistantType = (infoArray.length > 5) ? infoArray[5] : "";
               students[num] = new GraduateStudent(studName, studID, isEnrolled, isGradAssistant, gradAssistantType, coursesEnrolled);
           }
           else if(studID >= 300 && studID < 399){
               int creditsEnrolled = Integer.parseInt(infoArray[3]);
               students[num] = new OnlineStudent(studName, studID, isEnrolled, creditsEnrolled);
           }
           num++;
           
        }

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
