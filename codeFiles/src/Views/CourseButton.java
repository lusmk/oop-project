package Views;

import Models.Characters.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseButton extends JButton {
    private String courseName;
    private int x;
    private int y;

    public CourseButton(String courseName, int x, int y) {
        super();
        setText(courseName);
        setBounds(x, y, 220, 30);
        setBackground(Color.BLUE);
        setFocusable(false);
        setFont(new Font("Comic Sans", Font.BOLD, 25));
        setForeground(Color.WHITE);
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
