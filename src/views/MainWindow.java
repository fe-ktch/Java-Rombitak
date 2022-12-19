/*
* File: MainWindow.java
* Author: Sangare F. Felisha
* Copyright: 2022, Sangare F. Felisha
* Group: SZOFT II N
* Date: 2022-12-19
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

    TitlePanel titlePanel;

    public AsidePanel asidePanel;
    public AlphaPanel alphaPanel;
    public PerimeterPanel volumePanel;
    public AreaPanel areaPanel;
    public ButtonsPanel buttonsPanel;
    public JButton aboutButton;

    public MainWindow() {

        this.titlePanel = new TitlePanel(); 
        this.asidePanel = new AsidePanel();
        this.alphaPanel = new AlphaPanel();
        this.volumePanel = new PerimeterPanel();
        this.areaPanel = new AreaPanel();
        this.buttonsPanel = new ButtonsPanel();

        this.initWindow();
    }
    public void initWindow() {

        this.setTitle("rombitak"); 
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void addComponent() {

        this.add(this.titlePanel);
        this.add(this.asidePanel);
        this.add(this.alphaPanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
        this.add(this.areaPanel);
    }
}