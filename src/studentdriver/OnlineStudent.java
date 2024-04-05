/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s560346
 */
public class OnlineStudent extends StudentFees {

    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;

    public OnlineStudent(String studentName, int studentId, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentId, isEnrolled);
    }

    public double getPayableAmount() {
        return this.noOfMonths * this.MONTHLY_FEE;
    }

    @Override
    public String toString() {
        return "Student name: " + this.getStudentName() + "\nStudent id:" + this.getStudentId() + "\nEnrolled: " + this.isIsEnrolled() + "\nNo of Months: " + this.noOfMonths + "\nPayable Amount: " + this.getPayableAmount();
    }
}
