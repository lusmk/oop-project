package Views;

import Models.Characters.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class GameUI extends JFrame {
    public static final int WIDTH = 740;
    public static final int HEIGHT = 410;
    private String studentName;

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
        welcomePanel.setBackground(Color.PINK);
        welcomePanel.setLayout(new GridLayout(6,1));
        JLabel welcomeText = new JLabel("Hello! Welcome to AUA.");
        welcomePanel.add(welcomeText);
        JLabel name = new JLabel("Please type in your name");
        welcomePanel.add(name);
        TextField nameField = new TextField(20);
        JButton submitNameButton = new JButton("SUBMIT");
        submitNameButton.setBounds(550, 300, 220, 30);
        submitNameButton.setBackground(Color.GREEN);
        submitNameButton.setFocusable(false);
        submitNameButton.setFont(new Font("Comic Sans", Font.BOLD, 25));
        submitNameButton.setForeground(Color.WHITE);
        welcomePanel.add(nameField);
        welcomePanel.add(submitNameButton);
        JLabel majorText = new JLabel("Please select your major");
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

        //CS semester 1 panel
        CourseButton Calculus1 = new CourseButton("Calculus1", 50, 400);
        CourseButton DiscreteMath = new CourseButton("Discrete Math",100,400);
        CourseButton IntroToCS = new CourseButton("Intro to CS",150,400);

        // student panel
        JLabel studentMajor = new JLabel("Major name: " + CS.getText());
        JPanel studentProfile = new JPanel(new GridLayout(1, 2));
        JLabel studentAvatar = new JLabel(new ImageIcon("codeFiles/src/Views/avatar.png"));
        studentAvatar.setPreferredSize(new Dimension(100, 100));
        studentProfile.add(studentAvatar);

        //panel for name and major
        JPanel studentNameMajor = new JPanel(new GridLayout(2, 1));

        submitNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                source.setEnabled(false);
                source.setBackground(Color.GRAY);
                studentName = nameField.getText();
                JLabel studentName1 = new JLabel(studentName);
                studentNameMajor.add(studentName1);
            }
        });
        studentNameMajor.add(studentMajor);
        studentProfile.add(studentNameMajor);
        JPanel CSPanel = new JPanel(new GridLayout(4, 1));


        // business semester 1 panel
//        CourseButton BusinessMath1 = new CourseButton("BusinessMath1", 50, 400);
//        CourseButton IntroToBusiness = new CourseButton("Intro To Business",100,400);

//        JPanel BusinessPanel = new JPanel(new GridLayout(3, 1));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startingPanel.setVisible(false);
                welcomePanel.setVisible(true);
                add(welcomePanel);
            }
        });

        EnergyPanel energyButtons = new EnergyPanel();
        studentProfile.add(energyButtons);
        CS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CSPanel.add(studentProfile);
                CSPanel.add(Calculus1);
                CSPanel.add(DiscreteMath);
                CSPanel.add(IntroToCS);
                welcomePanel.setVisible(false);
                CSPanel.setVisible(true);
                add(CSPanel);
            }
        });

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

//        BUS.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                BusinessPanel.add(studentProfile);
//                BusinessPanel.add(BusinessMath1);
//                BusinessPanel.add(IntroToBusiness);
//                welcomePanel.setVisible(false);
//                BusinessPanel.setVisible(true);
//                add(BusinessPanel);
//            }
//        });
    }
    private class Calculus1Test extends JPanel {
        private static int grade = 0;
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
                String[] arr = sc.nextLine().split(":");
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
            JLabel studentGrade = new JLabel("Your grade is " + grade);
            JLabel pass;
            if(grade == 5)
                pass = new JLabel("Congratulations, you passed the course");
            else
                pass = new JLabel("You failed the course. Good luck next time.");
            gradePanel.add(studentGrade);
            gradePanel.add(pass);

            JButton submit = new JButton("Submit");
            this.add(submit);
            JButton back = new JButton("Back to your profile");
            this.add(back);

            submit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(!(answer1.getText().equals(""))) {
                        if(answer1.getText().equals(answers.get(0)))
                            grade++;
                    }

                    if(!(answer2.getText().equals(""))) {
                        if(answer2.getText().equals(answers.get(1)))
                            grade++;
                    }

                    if(!(answer3.getText().equals(""))) {
                        if(answer3.getText().equals(answers.get(2)))
                            grade++;
                    }

                    if(!(answer4.getText().equals(""))) {
                        if(answer4.getText().equals(answers.get(3)))
                            grade++;
                    }

                    if(!(answer5.getText().equals(""))) {
                        if(answer5.getText().equals(answers.get(4)))
                            grade++;
                    }
                    setVisible(false);
                    gradePanel.setVisible(true);
                }
            });

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
    }
}
