package Views;

import Models.Characters.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MajorButton extends JButton {
    private Student.Major majorName;
    private int x;
    private int y;

    public MajorButton(Student.Major majorName, int x, int y) {
        super();
        String name;
        if(majorName != Student.Major.BUSINESS) {
            String[] major = String.valueOf(majorName).split("_");
            name = major[0] + " " + major[1];
        }else
            name = String.valueOf(majorName);
        setText(name);
        setBounds(x, y, 220, 30);
        setBackground(Color.GREEN);
        setFocusable(false);
        setFont(new Font("Comic Sans", Font.BOLD, 25));
        setForeground(Color.WHITE);

    }




}
