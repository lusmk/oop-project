
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
        Major major = null;
        System.out.println("Please pick your major \n1." + Major.COMPUTER_SCIENCE
                        + "\n2." + Major.DATA_SCIENCE +"\n3." + Major.ENGINEERING_SCIENCE +"\n4." +
                Major.BUSINESS + "\n5." +Major.ENGLISH_AND_COMMUNICATIONS+
                "\n6." +Major.POLITICS_AND_GOVERNANCE);
        int number = sc.nextInt();
        switch(number){
            case 1:
                major = Major.COMPUTER_SCIENCE;
                break;
            case 2:
                major = Major.DATA_SCIENCE;
                break;
        }
        String m = "Computer Science"; //TODO: Check grid added later
        System.out.println("You have picked your major. Here are your assignments, you need to " +
                "complete all of them to pass to the next semester");
        Student student = new Student(name, major, Student.Degree.UNDERGRADUATE);
        Course calculus = new Calculus1();

            try {
                boolean pass = calculus.checkAssignment("codeFiles/src/calculus1.txt");
                System.out.println("You have passed the course. Congratulations!");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }


    }

    public static void main(String[] args) {
        Console game = new Console();
        game.play();
    }
}
