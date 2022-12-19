/*
* File: ButtonsPanel.java
* Author: Sangare F. Felisha
* Copyright: 2022, Sangare F. Felisha
* Group: SZOFT II N
* Date: 2022-12-19
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/

package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {

    public JButton calcButton;
    public JButton aboutButton;

    public ButtonsPanel() {

        calcButton = new JButton("Calculate");
        aboutButton = new JButton("About");

        addComponents();
    }
    public void addComponents() {

        add(this.calcButton);
        add(this.aboutButton);
    }
}