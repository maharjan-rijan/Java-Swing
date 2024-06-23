import javax.swing.*;
import java.awt.*;

public class GridFormat extends JFrame {

    public GridFormat() {
        // Set the title of the JFrame
        setTitle("GridLayout Demo");

        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager to GridLayout
        // GridLayout(rows, cols, horizontalGap, verticalGap)
        setLayout(new GridLayout(3, 3, 5, 5)); // 3 rows, 3 columns, 5px gaps

        // Create buttons and add them to the GridLayout
        for (int i = 1; i <= 9; i++) {
            add(new JButton("Button " + i));
        }

        // Set the size of the JFrame
        setSize(700, 700);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);

        // Make the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new GridFormat());
    }
}
