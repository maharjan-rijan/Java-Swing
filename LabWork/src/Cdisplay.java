import javax.swing.*;
import java.awt.*;

public class Cdisplay extends JFrame {

    // Custom JPanel class to display the string "KBC"
    class DPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the font size and style
            g.setFont(new Font("Dolphin", Font.ITALIC, 90));

            // Set the color for the string
            g.setColor(Color.RED);

            // Draw the string "KBC" in the center of the panel
            String text = "KBC";
            FontMetrics fm = g.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g.drawString(text, x, y);
        }
    }

    public Cdisplay() {
        // Set the title of the JFrame
        setTitle("KBC Display");

        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JPanel and add it to the JFrame
        add(new DPanel());

        // Set the size of the JFrame
        setSize(500, 500);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);

        // Make the JFrame visible
        setVisible(true);
    }
    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new Cdisplay());
    }
}
