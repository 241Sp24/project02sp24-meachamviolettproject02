/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S554635
 */
public abstract class StudentFees {

    private String studentName;
    private int studentId;
    private boolean isEnrolled;
    int CREDITS_PER_COURSE = 3;
    double PER_CREDIT_FEE = 543.50;

    public StudentFees(String studentName, int studentId, boolean isEnrolled) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.isEnrolled = isEnrolled;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the isEnrolled
     */
    public boolean isIsEnrolled() {
        return isEnrolled;
    }

    /**
     * @param isEnrolled the isEnrolled to set
     */
    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    /**
     * @return the CREDITS_PER_COURSE
     */
    public int getCREDITS_PER_COURSE() {
        return CREDITS_PER_COURSE;
    }

    /**
     * @return the PER_CREDIT_FEE
     */
    public double getPER_CREDIT_FEE() {
        return PER_CREDIT_FEE;
    }

    public abstract double getPayableAmount();
}
