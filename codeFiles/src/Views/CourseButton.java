package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseButton extends JButton {

    public CourseButton(String courseName, int x, int y) {
        super();
        setText(courseName);
        setBounds(x, y, 220, 30);
        setBackground(Color.BLUE);
        setFocusable(false);
        setFont(new Font("Comic Sans", Font.PLAIN, 15));
        setForeground(Color.WHITE);
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
