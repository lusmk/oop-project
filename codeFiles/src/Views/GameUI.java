package Views;

import Models.Characters.Student;
import Models.Courses.BusinessMath1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    private String studentName;

    public GameUI() {
        super("AUA Student Life Simulator");

        //jframe
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);

        //panel for start
        JPanel startingPanel = new JPanel();
        startingPanel.setBackground(Color.PINK);
        startingPanel.setLayout(null);

        //play button
        JButton button = new JButton("PLAY");
        button.setBounds(550, 300, 220, 30);
        button.setBackground(Color.GREEN);
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

        submitNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentName = nameField.getText();
            }
        });

        // student panel
        JPanel studentProfile = new JPanel(new GridLayout(3, 1));
        JLabel studentName1 = new JLabel(studentName);
        JLabel studentMajor = new JLabel();
        JLabel studentAvatar = new JLabel(new ImageIcon("codeFiles/src/Views/avatar.png"));
        studentAvatar.setPreferredSize(new Dimension(100, 100));
        studentProfile.add(studentName1);
        studentProfile.add(studentMajor);
        studentProfile.add(studentAvatar);

        JPanel CSPanel = new JPanel(new GridLayout(4, 1));
        CSPanel.add(studentProfile);
        CSPanel.add(Calculus1);
        CSPanel.add(DiscreteMath);
        CSPanel.add(IntroToCS);

        // business semester 1 panel
        CourseButton BusinessMath1 = new CourseButton("BusinessMath1", 50, 400);
        CourseButton IntroToBusiness = new CourseButton("Intro To Business",100,400);

        JPanel BusinessPanel = new JPanel(new GridLayout(2, 1));
        BusinessPanel.add(BusinessMath1);
        BusinessPanel.add(IntroToBusiness);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startingPanel.setVisible(false);
                welcomePanel.setVisible(true);
                add(welcomePanel);
            }
        });

        CS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(false);
                CSPanel.setVisible(true);
                add(CSPanel);
            }
        });

        BUS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(false);
                BusinessPanel.setVisible(true);
                add(BusinessPanel);
            }
        });


    }
}
