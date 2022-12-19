/*
* File: MainController.java
* Author: Sangare F. Felisha
* Copyright: 2022, Sangare F. Felisha
* Group: SZOFT II N
* Date: 2022-12-19
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/

package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import views.MainWindow;

public class MainController {

    MainWindow mainWindow;

    public MainController() {

        this.mainWindow = new MainWindow();
        this.handleEvents();
    }
    public void handleEvents() {

        JButton calcButton = this.mainWindow.buttonsPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;

        calcButton.addActionListener(e-> onClickCalcButton());
        aboutButton.addActionListener(e-> onClickAboutButton());
    }
    public void onClickCalcButton() {

        String asideString = this.mainWindow.asidePanel.getValue();
        String alphaString = this.mainWindow.alphaPanel.getValue();

        double aside = Double.parseDouble(asideString);
        double alpha = Double.parseDouble(alphaString);

        Double volume = 4 * aside;
        Double radian = alpha* Math.PI/180;
        Double area = Math.pow(aside, 2)*Math.sin(radian);
        
        this.mainWindow.volumePanel.setValue(volume.toString());
        this.mainWindow.areaPanel.setValue(area.toString());
    }
     public void onClickAboutButton() {

        String about = "rombitak\nversion: 0.1\nSangare F. Felisha\nSZOFT II N\n2022-12-19";
        JOptionPane.showMessageDialog(this.mainWindow.getContentPane(), about);
    }
}