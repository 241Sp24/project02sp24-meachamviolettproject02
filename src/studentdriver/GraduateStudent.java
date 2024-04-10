/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S554635
 */
public class GraduateStudent extends StudentFees {

    private int coursesEnrolled;
    private boolean isGraduateStudent;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 645.45;

    public GraduateStudent(String studentName, int studentId, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentId, isEnrolled);
        this.isGraduateStudent = isGraduateStudent;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }

    public GraduateStudent(String studentName, int studentId, boolean isEnrolled) {
        super(studentName, studentId, isEnrolled);
    }

    /**
     * @return the coursesEnrolled
     */
    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    /**
     * @return the isGraduateStudent
     */
    public boolean isIsGraduateStudent() {
        return isGraduateStudent;
    }

    /**
     * @return the graduateAssistantType
     */
    public String getGraduateAssistantType() {
        return graduateAssistantType;
    }

    public double getPayableAmount() {
        if (this.graduateAssistantType.equals("half")) {
            return (this.coursesEnrolled * this.CREDITS_PER_COURSE * this.PER_CREDIT_FEE + this.ADDITIONAL_FEES) / 2;
        } else if (this.graduateAssistantType.equals("full")) {
            return 0;
        } else {
            return this.coursesEnrolled * this.CREDITS_PER_COURSE * this.PER_CREDIT_FEE + this.ADDITIONAL_FEES;
        }
    }

    @Override
    public String toString() {
        return "Student name: " + this.getStudentName() + "\nStudent id:" + this.getStudentId() + "\nEnrolled: " + this.isIsEnrolled() + "\nGraduate Assistant: " + this.isIsGraduateStudent() + "\nGraduate Assistant Type: " + this.graduateAssistantType + "\nCourses Enrolled: " + this.coursesEnrolled + "\nPayable Amount: " + this.getPayableAmount();
    }

}
