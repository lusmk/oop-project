package Views;

import Models.Characters.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

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

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startingPanel.setVisible(false);
                welcomePanel.setVisible(true);
                add(welcomePanel);
            }
        });
        final String[] studentName = new String[1];
        submitNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              studentName[0] = nameField.getText(); //TODO: suspicious erevuyt
            }
        });



    }
}
