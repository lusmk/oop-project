package Models.Courses;

import Models.Characters.Student;

import java.io.File;
import java.util.Scanner;

public class PriniciplesOfMicroeconomics extends Course {
    private static int questionsAnswered = 0;

    public PriniciplesOfMicroeconomics() {
        super(Student.Major.BUSINESS, 3,
                "codeFiles/src/TextFiles/PrinciplesOfMicroeconomics.txt");
    }

    public boolean checkAssignment(String quiz) throws Exception {
        File file = new File(quiz);
        Scanner sc = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        int grade = this.getGrade();
        for(int i = 0; i < questionsAnswered; i++){
            sc.nextLine();
        }
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(":");
            String question = arr[0];
            String answer = arr[1];
            System.out.println(question);
            String input = keyboard.nextLine();
            if(input.equals("-1")) break;
            questionsAnswered++;
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
