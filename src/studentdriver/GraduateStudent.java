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

    public String toString() {
        return "";
    }

}
