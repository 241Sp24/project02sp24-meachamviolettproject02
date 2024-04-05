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

    public String toString() {
        return "";
    }
}
