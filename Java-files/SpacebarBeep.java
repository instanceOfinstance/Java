import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SpacebarBeep extends JFrame {

    public SpacebarBeep() {
        // Set up the JFrame
        setTitle("Spacebar Beep Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a KeyListener to the JFrame
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not needed for this example
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not needed for this example
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Check if the pressed key is the spacebar (keyCode = KeyEvent.VK_SPACE)
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    // Beep using the Toolkit
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });

        // Make the JFrame focusable to receive key events
        setFocusable(true);
    }

    public static void main(String[] args) {
        // Create an instance of the SpacebarBeep class
        SpacebarBeep spacebarBeep = new SpacebarBeep();

        // Set the JFrame visible
        spacebarBeep.setVisible(true);
    }
}

