/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

/**
 *
 * @author toanbn_c0809j1
 */
public class BackgroundImagePanel extends JComponent {
private Image backgroundImage = null;

/**
* Constructor
*/
public BackgroundImagePanel() {
super();
}


public void setBackgroundImage(Image backgroundImage) {
this.backgroundImage = backgroundImage;
}

/**
* Overrides the painting to display a background image
*/  
    @Override
protected void paintComponent(Graphics g) {
if (isOpaque()) {
g.setColor(getBackground());
g.fillRect(0, 0, getWidth(), getHeight());
}
if (backgroundImage != null) {
g.drawImage(backgroundImage,0,0,this);
}
}
}
