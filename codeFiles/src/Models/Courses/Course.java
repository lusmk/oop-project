package Models.Courses;

import Models.Characters.Student;

import java.io.File;
import java.util.Scanner;

public abstract class Course {
    //instance variables
    private Student.Major name;
    private int credits;
    private int grade;
    //private Assignment assignment;
    protected boolean isPassed;   //change to private if needed
    private String location;

    //no-arg constructor
    public Course() {
        name = null;
        credits = 0;
        grade = 0;
        location = "";
    }

    //second constructor
    public Course(Student.Major name, int credits, String location) {
        this.name = name;
        this.credits = credits;
        this.grade = 0;
        this.location = location;
    }

    //copy constructor
    public Course(Course course) {
        this.name = course.name;
        this.credits = course.credits;
        this.grade = course.grade;
        this.location = course.location;
    }

    //accessor for major name
    public Student.Major getName() {
        return name;
    }

    // accessor for credits
    public int getCredits() {
        return this.credits;
    }

    public String getLocation() {
        return this.location;
    }

    public int getGrade() {
        return this.grade;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public abstract boolean checkAssignment(String quiz) throws Exception;
}