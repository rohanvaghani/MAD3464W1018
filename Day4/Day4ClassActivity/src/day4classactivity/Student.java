/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4classactivity;

/**
 *
 * @author macstudent
 */
public class Student {
    int studentID;
    String name;
    double percentage;
    
    Student() {
        this.studentID = 0;
        this.name = "Unknown";
        this.percentage = 0.0;
    }

    Student(int studentID, String name, double percentage) {
        this.studentID = studentID;
        this.name = name;
        this.percentage = percentage;
    }
    
    int getID() {
        return this.studentID;
    }
    
    void setID(int ID) {
        this.studentID = ID; 
    }
    
    String getName() {
        return this.name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    double getPercentage() {
        return this.percentage;
    }
    
    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    void displayInfo() {
        System.out.println("Student ID : " + this.studentID + "\n Name : " + this.name + "\n Percentage : " + this.percentage );
    }
}
