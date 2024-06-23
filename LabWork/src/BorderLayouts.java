import javax.swing.*;
import java.awt.*;

public class BorderLayouts extends JFrame {

    public BorderLayouts() {
        // Set the title of the JFrame
        setTitle("BorderLayout Demo");
        // Set the layout manager to BorderLayout
        setLayout(new BorderLayout(10, 10)); // with horizontal and vertical gaps of 10 pixels

        // Create buttons to be added to the BorderLayout regions
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Add buttons to the BorderLayout regions
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);

        // Set the size of the JFrame
        setSize(700, 700);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new BorderLayouts());
    }
}
