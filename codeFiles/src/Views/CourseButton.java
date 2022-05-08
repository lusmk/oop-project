package Views;

import Models.Characters.Student;

import javax.swing.*;
import java.awt.*;

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
    }
}
