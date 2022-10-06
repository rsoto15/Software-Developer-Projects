package com.attendancemanagement;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class Student {
    @NotBlank(message = "Student ID cannot be blank")
    private String studentID;
    @NotBlank(message = "First Name cannot be blank")
    private String lastName;
    @NotBlank(message = "Last Name cannot be blank")
    private String firstName;
    private int grade;
    @CustomConstraint(message = "Assessment must be 'Yes' or 'No'")
    private String assessment;
    @CustomConstraint(message = "ROI must be 'Yes' or 'No'")
    private String returnOI;
    @CustomConstraint(message = "Referral must be 'Yes' or 'No'")
    private String referral;
    private String id;




    public Student() {
        this.id = UUID.randomUUID().toString();
    }


    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String isAssessment() {
        return this.assessment;
    }

    public String getAssessment() {
        return this.assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String isReturnOI() {
        return this.returnOI;
    }

    public String getReturnOI() {
        return this.returnOI;
    }

    public void setReturnOI(String returnOI) {
        this.returnOI = returnOI;
    }

    public String isReferral() {
        return this.referral;
    }

    public String getReferral() {
        return this.referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
