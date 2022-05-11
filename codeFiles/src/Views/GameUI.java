package Views;

import Models.Characters.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class GameUI extends JFrame {
    public static final int WIDTH = 740;
    public static final int HEIGHT = 410;
    private String studentName;
    JPanel CSPanel;
    private int totalGrade;

    private class Calculus1Test extends JPanel {
        public static int grade = 0;
        public Calculus1Test() throws FileNotFoundException {
            setSize(WIDTH, HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLayout(new GridLayout(12, 1));

            File file = new File("codeFiles/src/TextFiles/calculus1.txt");
            Scanner sc = new Scanner(file);

            ArrayList<String> questions = new ArrayList<>(5);
            ArrayList<String> answers = new ArrayList<>(5);
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split("Answer:");
                String question = arr[0];
                questions.add(question);
                String answer = arr[1];
                answers.add(answer);
            }

            JLabel question1 = new JLabel(questions.get(0));
            add(question1);
            JTextField answer1 = new JTextField();
            add(answer1);
            JLabel question2 = new JLabel(questions.get(1));
            add(question2);
            JTextField answer2 = new JTextField();
            add(answer2);
            JLabel question3 = new JLabel(questions.get(2));
            add(question3);
            JTextField answer3 = new JTextField();
            add(answer3);
            JLabel question4 = new JLabel(questions.get(3));
            add(question4);
            JTextField answer4 = new JTextField();
            add(answer4);
            JLabel question5 = new JLabel(questions.get(4));
            add(question5);
            JTextField answer5 = new JTextField();
            add(answer5);



            JFrame gradePanel = new JFrame();
            gradePanel.setSize(740, 410);
            gradePanel.setLayout(new GridLayout(2, 1));
            gradePanel.setBackground(Color.pink);

            JButton submit = new JButton("Submit");
            this.add(submit);
            JButton back = new JButton("Back to your profile");
            this.add(back);

            submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String answers1 = answer1.getText();
                    String answers2 = answer2.getText();
                    String answers3 = answer3.getText();
                    String answers4 = answer4.getText();
                    String answers5 = answer5.getText();

                    if(!(answers1.equals(""))) {
                        if(answers1.equals(answers.get(0)))
                            grade++;
                    }

                    if(!(answers2.equals(""))) {
                        if(answers2.equals(answers.get(1)))
                            grade++;
                    }

                    if(!(answers3.equals(""))) {
                        if(answers3.equals(answers.get(2)))
                            grade++;
                    }

                    if(!(answers4.equals(""))) {
                        if(answers4.equals(answers.get(3)))
                            grade++;
                    }

                    if(!(answers5.equals(""))) {
                        if(answers5.equals(answers.get(4)))
                            grade++;
                    }
                    JLabel studentGrade = new JLabel("Your grade is " + grade);
                    JLabel pass;
                    if(grade == 5){
                        totalGrade += grade;
                        pass = new JLabel("Congratulations, you passed the course");
                    }

                    else
                        pass = new JLabel("You failed the course. Good luck next time.");
                    gradePanel.add(studentGrade);
                    gradePanel.add(pass);
                    //setVisible(false);
                    gradePanel.setVisible(true);
                }
            });

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CSPanel.setVisible(true);
                }
            });
        }
    }

    private class DiscreteMathTest extends JPanel {
        public static int grade = 0;
        public DiscreteMathTest() throws FileNotFoundException {
            setSize(WIDTH, HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLayout(new GridLayout(12, 1));

            File file = new File("codeFiles/src/TextFiles/discretemath.txt");
            Scanner sc = new Scanner(file);

            ArrayList<String> questions = new ArrayList<>(5);
            ArrayList<String> answers = new ArrayList<>(5);
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split("Answer:");
                String question = arr[0];
                questions.add(question);
                String answer = arr[1];
                answers.add(answer);
            }

            JLabel question1 = new JLabel(questions.get(0));
            add(question1);
            JTextField answer1 = new JTextField();
            add(answer1);
            JLabel question2 = new JLabel(questions.get(1));
            add(question2);
            JTextField answer2 = new JTextField();
            add(answer2);
            JLabel question3 = new JLabel(questions.get(2));
            add(question3);
            JTextField answer3 = new JTextField();
            add(answer3);
            JLabel question4 = new JLabel(questions.get(3));
            add(question4);
            JTextField answer4 = new JTextField();
            add(answer4);
            JLabel question5 = new JLabel(questions.get(4));
            add(question5);
            JTextField answer5 = new JTextField();
            add(answer5);



            JFrame gradePanel = new JFrame();
            gradePanel.setSize(740, 410);
            gradePanel.setLayout(new GridLayout(2, 1));
            gradePanel.setBackground(Color.pink);

            JButton submit = new JButton("Submit");
            this.add(submit);
            JButton back = new JButton("Back to your profile");
            this.add(back);

            submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String answers1 = answer1.getText();
                    String answers2 = answer2.getText();
                    String answers3 = answer3.getText();
                    String answers4 = answer4.getText();
                    String answers5 = answer5.getText();

                    if(!(answers1.equals(""))) {
                        if(answers1.equals(answers.get(0)))
                            grade++;
                    }

                    if(!(answers2.equals(""))) {
                        if(answers2.equals(answers.get(1)))
                            grade++;
                    }

                    if(!(answers3.equals(""))) {
                        if(answers3.equals(answers.get(2)))
                            grade++;
                    }

                    if(!(answers4.equals(""))) {
                        if(answers4.equals(answers.get(3)))
                            grade++;
                    }

                    if(!(answers5.equals(""))) {
                        if(answers5.equals(answers.get(4)))
                            grade++;
                    }
                    JLabel studentGrade = new JLabel("Your grade is " + grade);
                    JLabel pass;
                    if(grade == 5) {
                        totalGrade += grade;
                        pass = new JLabel("Congratulations, you passed the course");
                    }
                    else
                        pass = new JLabel("You failed the course. Good luck next time.");
                    gradePanel.add(studentGrade);
                    gradePanel.add(pass);
                    //setVisible(false);
                    gradePanel.setVisible(true);
                    System.out.println(totalGrade);
                    if(totalGrade == 15) {
                        JFrame graduation = new JFrame();
                        graduation.setSize(GameUI.WIDTH, GameUI.HEIGHT);
                        graduation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        graduation.setResizable(false);
                        JLabel graduationImage = new JLabel(new ImageIcon("codeFiles/src/Views/Graduation.jpeg"));
                        graduationImage.setPreferredSize(new Dimension(GameUI.WIDTH, GameUI.HEIGHT));
                        graduation.add(graduationImage);
//                        JLabel grad = new JLabel("Congratulation, you have graduated from AUA");
//                        graduation.add(grad);
                        graduation.setVisible(true);
                    }

                }
            });

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CSPanel.setVisible(true);
                }
            });
        }
    }

    private class IntroToCSTest extends JPanel {
        public static int grade = 0;
        public IntroToCSTest() throws FileNotFoundException {
            setSize(WIDTH, HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLayout(new GridLayout(12, 1));

            File file = new File("codeFiles/src/TextFiles/introtocs.txt");
            Scanner sc = new Scanner(file);

            ArrayList<String> questions = new ArrayList<>(5);
            ArrayList<String> answers = new ArrayList<>(5);
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split("Answer:");
                String question = arr[0];
                questions.add(question);
                String answer = arr[1];
                answers.add(answer);
            }

            JLabel question1 = new JLabel(questions.get(0));
            add(question1);
            JTextField answer1 = new JTextField();
            add(answer1);
            JLabel question2 = new JLabel(questions.get(1));
            add(question2);
            JTextField answer2 = new JTextField();
            add(answer2);
            JLabel question3 = new JLabel(questions.get(2));
            add(question3);
            JTextField answer3 = new JTextField();
            add(answer3);
            JLabel question4 = new JLabel(questions.get(3));
            add(question4);
            JTextField answer4 = new JTextField();
            add(answer4);
            JLabel question5 = new JLabel(questions.get(4));
            add(question5);
            JTextField answer5 = new JTextField();
            add(answer5);



            JFrame gradePanel = new JFrame();
            gradePanel.setSize(740, 410);
            gradePanel.setLayout(new GridLayout(2, 1));
            gradePanel.setBackground(Color.pink);

            JButton submit = new JButton("Submit");
            this.add(submit);
            JButton back = new JButton("Back to your profile");
            this.add(back);

            submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String answers1 = answer1.getText();
                    String answers2 = answer2.getText();
                    String answers3 = answer3.getText();
                    String answers4 = answer4.getText();
                    String answers5 = answer5.getText();

                    if(!(answers1.equals(""))) {
                        if(answers1.equals(answers.get(0)))
                            grade++;
                    }

                    if(!(answers2.equals(""))) {
                        if(answers2.equals(answers.get(1)))
                            grade++;
                    }

                    if(!(answers3.equals(""))) {
                        if(answers3.equals(answers.get(2)))
                            grade++;
                    }

                    if(!(answers4.equals(""))) {
                        if(answers4.equals(answers.get(3)))
                            grade++;
                    }

                    if(!(answers5.equals(""))) {
                        if(answers5.equals(answers.get(4)))
                            grade++;
                    }
                    JLabel studentGrade = new JLabel("Your grade is " + grade);
                    JLabel pass;
                    if(grade == 5){
                        totalGrade += grade;
                        pass = new JLabel("Congratulations, you passed the course");
                    }

                    else
                        pass = new JLabel("You failed the course. Good luck next time.");
                    gradePanel.add(studentGrade);
                    gradePanel.add(pass);
                    //setVisible(false);
                    gradePanel.setVisible(true);
                }
            });

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    CSPanel.setVisible(true);
                }
            });
        }
    }
    public GameUI() throws IOException {
        super("AUA Student Life Simulator");

        //jframe
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        //panel for start
        JPanelWithBackground startingPanel = new JPanelWithBackground("codeFiles/src/Views/cover.jpeg");
        startingPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 270));

        //play button
        JButton button = new JButton("PLAY");
//        button.setBounds(550, 300, 220, 30);
        button.setBackground(new Color(1,60,94,255));
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.WHITE);
        startingPanel.add(button);
        add(startingPanel);

        // welcome panel
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(new Color(204,204,255));
        welcomePanel.setLayout(new GridLayout(5,1));
        JLabel welcomeText = new JLabel("Hello! Welcome to AUA.",SwingConstants.CENTER);
        welcomeText.setFont(new Font("Serif", Font.PLAIN, 20));
        welcomePanel.add(welcomeText);
        JPanel namePanel = new JPanel();
        namePanel.setBackground(new Color(204,204,255));
        JLabel name = new JLabel("Please type in your name",SwingConstants.CENTER);
        name.setFont(new Font("Serif", Font.PLAIN, 20));
        welcomePanel.add(name);
        TextField nameField = new TextField(20);
        JButton submitNameButton = new JButton("SUBMIT");
        submitNameButton.setBounds(550, 300, 100, 30);
        submitNameButton.setPreferredSize(new Dimension(150, 40));
        submitNameButton.setBackground(new Color(178,102,255));
        submitNameButton.setFocusable(false);
        submitNameButton.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        submitNameButton.setForeground(Color.WHITE);
        namePanel.add(nameField);
        namePanel.add(submitNameButton);
        welcomePanel.add(namePanel);
        JLabel majorText = new JLabel("Please select your major",SwingConstants.CENTER);
        majorText.setFont(new Font("Serif", Font.PLAIN, 20));
        welcomePanel.add(majorText);

        // major panel
        MajorButton CS = new MajorButton(Student.Major.COMPUTER_SCIENCE,50,400);
        MajorButton DS = new MajorButton(Student.Major.DATA_SCIENCE,100,400);
        MajorButton BUS = new MajorButton(Student.Major.BUSINESS,150,400);
        MajorButton ES = new MajorButton(Student.Major.ENGINEERING_SCIENCE,200,400);
        MajorButton EC = new MajorButton(Student.Major.ENGLISH_COMMUNICATIONS,250,400);
        MajorButton PG = new MajorButton(Student.Major.POLITICS_GOVERNANCE,250,400);

        JPanel majorPanel = new JPanel(new GridLayout(3,2));
        majorPanel.add(CS);
        majorPanel.add(DS);
        majorPanel.add(BUS);
        majorPanel.add(ES);
        majorPanel.add(EC);
        majorPanel.add(PG);
        welcomePanel.add(majorPanel);

        JPanel garbage = new JPanel();
        garbage.setBackground(new Color(204,204,255));

        JPanel coursePanel = new JPanel();
        coursePanel.setBackground(new Color(255,204,255));
        //CS semester 1 panel
        CourseButton Calculus1 = new CourseButton("Calculus1", 50, 400);
        Calculus1.setBackground(new Color(178,102,255));
        CourseButton DiscreteMath = new CourseButton("Discrete Math",100,400);
        DiscreteMath.setBackground(new Color(178,102,255));
        CourseButton IntroToCS = new CourseButton("Intro to CS",150,400);
        IntroToCS.setBackground(new Color(178,102,255));
        coursePanel.add(Calculus1);
        coursePanel.add(DiscreteMath);
        coursePanel.add(IntroToCS);

        JPanel bigPanel = new JPanel(new FlowLayout());
        bigPanel.setBackground(new Color(255,204,255));
        bigPanel.add(new JLabel());
        bigPanel.add(coursePanel);
        bigPanel.add(new JLabel());

        // student panel
        JLabel studentMajor = new JLabel("Major name: " + CS.getText());
        JPanel studentProfile = new JPanel(new GridLayout(1, 2));
        studentProfile.setBackground(new Color(178,102,255));
        ImageIcon logoImage = new ImageIcon("codeFiles/src/Views/avatar.png");
        Image image = logoImage.getImage();
        Image newAvatar = image.getScaledInstance(80, 90,  java.awt.Image.SCALE_SMOOTH);
        logoImage = new ImageIcon(newAvatar);
        JLabel studentAvatar = new JLabel(logoImage);
        studentProfile.add(studentAvatar);
        JLabel instructionsHeading= new JLabel("Instructions", SwingConstants.CENTER);
        instructionsHeading.setFont(new Font("Serif", Font.PLAIN, 20));
        JLabel instructions = new JLabel("<html>Below you see the list of required courses for your graduation. Under each icon you can find a quiz for corresponding course. You can only pass the course if you give correct answer to all questions.<br/>Good luck!</html>", SwingConstants.CENTER);


        //panel for name and major
        JPanel studentNameMajor = new JPanel(new GridLayout(2, 1));
        studentNameMajor.setBackground(new Color(178,102,255));

        submitNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                source.setEnabled(false);
                source.setBackground(Color.GRAY);
                studentName = nameField.getText();
                JLabel studentName1 = new JLabel(studentName);
                studentNameMajor.add(studentName1);
                CS.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        CSPanel.add(studentProfile);
                        CSPanel.add(instructionsHeading);
                        CSPanel.add(instructions);
                        CSPanel.add(bigPanel);
//                        CSPanel.add(Calculus1);
//                        CSPanel.add(new Label());
//                        CSPanel.add(DiscreteMath);
//                        CSPanel.add(new Label());
//                        CSPanel.add(IntroToCS);
//                        CSPanel.add(new Label());
                        welcomePanel.setVisible(false);
                        CSPanel.setVisible(true);
                        add(CSPanel);
                    }
                });
            }
        });
        studentNameMajor.add(studentMajor);
        studentProfile.add(studentNameMajor);
        CSPanel = new JPanel(new GridLayout(4, 1));
        CSPanel.setBackground(new Color(255,204,255));



        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startingPanel.setVisible(false);
                welcomePanel.setVisible(true);
                add(welcomePanel);
            }
        });

        EnergyPanel energyButtons = new EnergyPanel();
        studentProfile.add(energyButtons);


        Calculus1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Calculus1Test test = new Calculus1Test();
                    add(test);
                    CSPanel.setVisible(false);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        DiscreteMath.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    DiscreteMathTest test = new DiscreteMathTest();
                    add(test);
                    CSPanel.setVisible(false);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        IntroToCS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    IntroToCSTest test = new IntroToCSTest();
                    add(test);
                    CSPanel.setVisible(false);
                } catch(FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
