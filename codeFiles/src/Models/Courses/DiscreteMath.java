package Models.Courses;

import Models.Major;

import java.io.File;
import java.util.Scanner;

public class DiscreteMath extends Course {
        public DiscreteMath() {

            super(Major.COMPUTER_SCIENCE, 3, "discretemath.txt");
        }
        public boolean checkAssignment(String quiz) throws Exception {
            File file = new File(quiz);
            Scanner sc = new Scanner(file);
            Scanner keyboard = new Scanner(System.in);
            int grade = this.getGrade();
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
