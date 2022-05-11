package Views;

import Models.Places.Cafeteria;
import Models.Places.CoffeeHouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnergyPanel extends JPanel {

    public EnergyPanel(){
        super(new GridLayout(1,3));
        JButton cafeteriaButton = new JButton();
        ImageIcon cafeteria = new ImageIcon("codeFiles/src/Views/images/aries.png");
        Image image = cafeteria.getImage();
        Image newCafeteriaImage = image.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        cafeteria = new ImageIcon(newCafeteriaImage);
        cafeteriaButton.setIcon(cafeteria);
        cafeteriaButton.setFocusable(false);
        cafeteriaButton.setPreferredSize(new Dimension(70,60));
        add(cafeteriaButton);

        JButton coffeeHouseButton = new JButton();
        ImageIcon coffeeHouse = new ImageIcon("codeFiles/src/Views/images/coffeehouse.jpg");
        Image imageTemp = coffeeHouse.getImage();
        Image newCoffeeHouseImage = imageTemp.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        coffeeHouse = new ImageIcon(newCoffeeHouseImage);
        coffeeHouseButton.setIcon(coffeeHouse);
        coffeeHouseButton.setFocusable(false);
        coffeeHouseButton.setPreferredSize(new Dimension(70,60));
        add(coffeeHouseButton);

        JButton sleepButton = new JButton();
        ImageIcon sleep = new ImageIcon("codeFiles/src/Views/images/sleep.png");
        Image imageIcon= sleep.getImage();
        Image newSleepImage = imageIcon.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        sleep = new ImageIcon(newSleepImage);
        sleepButton.setIcon(sleep);
        sleepButton.setFocusable(false);
        sleepButton.setPreferredSize(new Dimension(70,60));
        add(sleepButton);

        cafeteriaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame cafeteria = new JFrame("Cafeteria");
                cafeteria.setSize(GameUI.WIDTH, GameUI.HEIGHT);
                cafeteria.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                cafeteria.setResizable(false);
                cafeteria.setLayout(new GridLayout(5,1));
                cafeteria.getContentPane().setBackground(new Color(204,255,204));
                ImageIcon logoImage = new ImageIcon("codeFiles/src/Views/images/aries.png");
                Image image = logoImage.getImage();
                Image newCafeteriaImage = image.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
                logoImage = new ImageIcon(newCafeteriaImage);
                JLabel logo = new JLabel(logoImage);
                cafeteria.add(logo);
                JPanel labels = new JPanel();
                JLabel welcomeText = new JLabel("Welcome to Aries. Here you can enjoy the most " +
                        "delicious food in university and recover your energy for being able to study. ");
                labels.add(welcomeText);
                JLabel offer = new JLabel("Below you can see the menu. Bon appetite");
                labels.add(offer);
                cafeteria.add(labels);
                JPanel menu = new JPanel();
                menu.setLayout(new GridLayout(3,2));
                JButton menuItem;
                for(int i = 0; i < Cafeteria.MENU.length; i++){
                    menuItem = new JButton(Cafeteria.MENU[i]+"%");
                    menuItem.setBackground(new Color(204,255,204));
                    menuItem.setFont(new Font("Serif", Font.PLAIN, 20));
                    menuItem.setFocusable(false);
                    if(i==2) {
                        menuItem = new JButton(Cafeteria.MENU[i]+"%");
                        menuItem.setFont(new Font("Serif",  Font.PLAIN, 20));
                        menuItem.setFocusable(false);
                        menuItem.setBackground(new Color(204,255,204));
                    }
                    menu.add(menuItem);
                }
                cafeteria.add(menu);
                cafeteria.add(new JPanel());
                cafeteria.setVisible(true);
            }
        });

        coffeeHouseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame coffeehouse = new JFrame("Cafeteria");
                coffeehouse.setSize(GameUI.WIDTH, GameUI.HEIGHT);
                coffeehouse.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                coffeehouse.setResizable(false);
                coffeehouse.setLayout(new GridLayout(5,1));
                coffeehouse.getContentPane().setBackground(new Color(255,102,102));
                ImageIcon logoImage = new ImageIcon("codeFiles/src/Views/images/coffeehouse.jpg");
                Image image = logoImage.getImage();
                Image newCafeteriaImage = image.getScaledInstance(70, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
                logoImage = new ImageIcon(newCafeteriaImage);
                JLabel logo = new JLabel(logoImage);
                coffeehouse.add(logo);
                JPanel labels = new JPanel();
                JLabel welcomeText = new JLabel("Welcome to Coffeehouse. Here you can enjoy the most " +
                        "delicious coffee in university and recover your energy for being able to study. ");
                labels.add(welcomeText);
                JLabel offer = new JLabel("Below you can see the menu. Enjoy your coffee!");
                labels.add(offer);
                coffeehouse.add(labels);
                JPanel menu = new JPanel();
                menu.setLayout(new GridLayout(3,2));
                JButton menuItem;
                for(int i = 0; i < CoffeeHouse.MENU.length; i++){
                    menuItem = new JButton(CoffeeHouse.MENU[i]+"%");
                    menuItem.setFont(new Font("Serif", Font.PLAIN, 20));
                    menuItem.setFocusable(false);
                    if(i==2) {
                        menuItem = new JButton(CoffeeHouse.MENU[i]+"%");
                        menuItem.setFont(new Font("Serif",  Font.PLAIN, 20));
                        menuItem.setFocusable(false);
                    }
                    menu.add(menuItem);
                }
                coffeehouse.add(menu);
                coffeehouse.add(new JPanel());
                coffeehouse.setVisible(true);
            }
        });
    }
    }




