import java.io.File;
import java.util.Scanner;

public class Course {
    //instance variables
    private Major name;
    private int credits;
    private int grade;
    //private Assignment assignment;
    private boolean isPassed;

    //no-arg constructor
    public Course() {
        name = new Major();
        credits = 0;
        grade = 0;
    }

    //second constructor
    public Course(Major name, int credits) {
        this.name = new Major(name);
        this.credits = credits;
        grade = 0;
    }

    //copy constructor
    public Course(Course course) {
        this.name = new Major(course.name);
        this.credits = course.credits;
        this.grade = course.grade;
    }

    //accessor for major name
    public Major getName() {
        return new Major(this.name);
    }

    // accessor for credits
    public int getCredits() {
        return this.credits;
    }

    public boolean checkAssignment(String quiz) throws Exception {
        File file = new File(quiz);
        Scanner sc = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(":");
            String question = arr[0];
            String answer = arr[1];
            System.out.println(question);
            String input = keyboard.nextLine();
            if (input.equals(answer)) {
                grade++;
            }
        }
        if(grade == 5){
            isPassed = true;
        }
        return isPassed;
    }
}