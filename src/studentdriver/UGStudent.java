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

    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(String studentName, int studentId, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentId, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.coursesEnrolled = coursesEnrolled;
        this.scholarshipAmount = scholarshipAmount;
    }

    /**
     * @return the scholarShipAmount
     */
    public double getScholarshipAmount() {
        return scholarshipAmount;
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
            return (this.coursesEnrolled * this.CREDITS_PER_COURSE * this.PER_CREDIT_FEE + this.ADDITIONAL_FEE) - this.getScholarshipAmount();
        } else {
            return this.coursesEnrolled * this.CREDITS_PER_COURSE * this.PER_CREDIT_FEE + this.ADDITIONAL_FEE;
        }

    }

    @Override
    public String toString() {
        return "Student name: " + this.getStudentName() + "\nStudent id:" + this.getStudentId() + "\nEnrolled: " + this.isIsEnrolled() + "\nScholarship: " + this.isHasScholarship() + "\nScholarship Amount: " + this.getScholarshipAmount() + "\nCourses Enrolled: " + this.coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount();
    }

}
