import java.util.Scanner;

public class Console {
    private boolean gameOver;

    public Console(){
        gameOver = false;
    }
    public void play(){
        System.out.println("Hello! Welcome to AUA.");
        System.out.println("Please type in your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Please type in your major");
        String m = "Computer Science";
        Major major = new Major(m);

        Student student = new Student(name, major, Person.Degree.UNDERGRADUATE);
        Course calculus = new Course(major, 3);

            try {
                boolean pass = calculus.checkAssignment("C:\\Users\\User\\OneDrive\\Desktop\\oop-project\\codeFiles\\src\\calculus1.txt");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }


    }

    public static void main(String[] args) {
        Console game = new Console();
        game.play();
    }
}
