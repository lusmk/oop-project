package Views;

import Models.Characters.Student;
import Models.Courses.Calculus1;
import Models.Courses.Course;


import java.util.Scanner;

public class Console {
    private boolean gameOver;

    public Console() {
        gameOver = false;
    }
    public void play(){
        System.out.println("Hello! Welcome to AUA.");
        System.out.println("Please type in your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student.Major major = null;
        System.out.println("Please pick your major \n1." + Student.Major.COMPUTER_SCIENCE
                        + "\n2." + Student.Major.DATA_SCIENCE +"\n3." + Student.Major.ENGINEERING_SCIENCE +"\n4." +
                Student.Major.BUSINESS + "\n5." + Student.Major.ENGLISH_COMMUNICATIONS+
                "\n6." + Student.Major.POLITICS_GOVERNANCE);
        int number = sc.nextInt();
        switch(number){
            case 1:
                major = Student.Major.COMPUTER_SCIENCE;
                break;
            case 2:
                major = Student.Major.DATA_SCIENCE;
                break;
        }
        String m = "Computer Science"; //TODO: Check grid added later
        System.out.println("You have picked your major. Here are your assignments, you need to " +
                "complete all of them to pass to the next semester");
        Student student = new Student(name, major, Student.Degree.UNDERGRADUATE, 100);
        Course calculus = new Calculus1();

            try {
                boolean pass = calculus.checkAssignment("codeFiles/src/TextFiles/calculus1.txt");
                student.assignmentEnergy(calculus);
//                calculus.checkAssignment("codeFiles/src/TextFiles/calculus1.txt");
//                System.out.println(student.getEnergy());
                if(pass)
                    System.out.println("You have passed the course. Congratulations!");
                else
                    System.out.println("Unfortunately you failed. Good luck next time.");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }

    public static void main(String[] args) {
        Console game = new Console();
        game.play();
    }
}
