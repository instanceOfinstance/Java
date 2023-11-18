import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MorseCodeInterpreter extends JFrame {

    private StringBuilder morseCodeBuilder = new StringBuilder();

    public MorseCodeInterpreter() {
        setTitle("Morse Code Interpreter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.addKeyListener(new MorseCodeKeyListener());

        add(textField);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class MorseCodeKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            // Not needed for this example
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyChar() == ' ') {
                // Space key is pressed
                morseCodeBuilder.append(" ");
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyChar() == ' ') {
                // Space key is released
                interpretMorseCode();
            }
        }

        private void interpretMorseCode() {
            String morseCode = morseCodeBuilder.toString().trim();

            if (morseCode.equals("...--")) {
                // Morse code for 3
                System.out.println("Hello");
            }

            // Clear the Morse code builder for the next input
            morseCodeBuilder.setLength(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MorseCodeInterpreter());
    }
}

