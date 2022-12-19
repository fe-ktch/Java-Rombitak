/*
* File: TitlePanel.java
* Author: Sangare F. Felisha
* Copyright: 2022, Sangare F. Felisha
* Group: SZOFT II N
* Date: 2022-12-19
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/

package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class TitlePanel extends JPanel {

    JLabel mainLabel;

    public TitlePanel() {

        this.mainLabel = new JLabel("Calculating the Volume and Area of a Rhombus");        
        this.mainLabel.setFont(new Font("Sans serif", Font.BOLD, 25));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 100));
        this.add(this.mainLabel);
    }
}