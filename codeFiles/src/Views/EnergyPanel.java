package Views;

import javax.swing.*;
import java.awt.*;

public class EnergyPanel extends JPanel {

    public EnergyPanel(){
        super(new GridLayout(1,2));
        JButton cafeteriaButton = new JButton();
        ImageIcon cafeteria = new ImageIcon("codeFiles/src/Views/aries.png");
        Image image = cafeteria.getImage();
        Image newCafeteriaImage = image.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        cafeteria = new ImageIcon(newCafeteriaImage);
        cafeteriaButton.setIcon(cafeteria);
        cafeteriaButton.setFocusable(false);
        cafeteriaButton.setPreferredSize(new Dimension(70,60));
        add(cafeteriaButton);

        JButton coffeeHouseButton = new JButton();
        ImageIcon coffeeHouse = new ImageIcon("codeFiles/src/Views/coffeehouse.jpg");
        Image imageTemp = coffeeHouse.getImage();
        Image newCoffeeHouseImage = imageTemp.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        coffeeHouse = new ImageIcon(newCoffeeHouseImage);
        coffeeHouseButton.setIcon(coffeeHouse);
        coffeeHouseButton.setFocusable(false);
        coffeeHouseButton.setPreferredSize(new Dimension(70,60));
        add(coffeeHouseButton);
    }
}
