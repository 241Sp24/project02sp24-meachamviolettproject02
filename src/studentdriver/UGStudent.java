/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s560346
 */
public class UGStudent extends StudentFees {

    private double scholarShipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(String studentName, int studentId, boolean isEnrolled) {
        super(studentName, studentId, isEnrolled);
    }

    /**
     * @return the scholarShipAmount
     */
    public double getScholarShipAmount() {
        return scholarShipAmount;
    }

    /**
     * @return the coursesEnrolled
     */
    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    /**
     * @return the hasScholarship
     */
    public boolean isHasScholarship() {
        return hasScholarship;
    }

    @Override
    public double getPayableAmount() {
        if (this.isHasScholarship() == true) {
            return (this.coursesEnrolled * this.CREDITS_PER_COURSE * this.PER_CREDIT_FEE + this.ADDITIONAL_FEE) - this.getScholarShipAmount();
        } else {
            return this.coursesEnrolled * this.CREDITS_PER_COURSE * this.PER_CREDIT_FEE + this.ADDITIONAL_FEE;
        }

    }
    @Override
    public String toString() {
        return "Student name: " + this.getStudentName() + "\nStudent id:" + this.getStudentId() + "\nEnrolled: " + this.isIsEnrolled() + "\nScholarship: " + this.isHasScholarship() + "\nScholarship Amount: " + this.getScholarShipAmount() + "\nCourses Enrolled: " + this.coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount();
    }

}
