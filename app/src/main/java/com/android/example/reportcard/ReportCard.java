package com.android.example.reportcard;

/**
 * Created by MOHANAAD on 3/11/17.
 */

public class ReportCard {

    private String mStudentName;
    private String mCourseName;
    private char mGrade;

    public ReportCard(String studentName, String courseName, char grade) {
        mStudentName = studentName;
        mCourseName = courseName;
        mGrade = grade;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public String getCourseName() {
        return mCourseName;
    }

    public char getGrade() {
        return mGrade;
    }

    public char setGrade(char newGrade) {
        return mGrade = newGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "StudentName is :'" + mStudentName + '\'' +
                ", CourseName is :'" + mCourseName + '\'' +
                ", Grade is :" + mGrade +
                '}';
    }
}
