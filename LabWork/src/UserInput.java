import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Sum Calculator");
        JLabel fInput = new JLabel();
        fInput.setText("Input First Number :");
        fInput.setBounds(40, 30,200,25);
        
        
        JLabel sInput = new JLabel();
        sInput.setText("Input Second Number :");
        sInput.setBounds(40, 70,200,25);
		
        // Create text fields for input
        JTextField FirstInput = new JTextField();
        JTextField SecondInput = new JTextField();
        
        // Set bounds for text fields (x, y, width, height)
        FirstInput.setBounds(170, 30, 200, 25);
        SecondInput.setBounds(170, 70, 200, 25);
        
        // Create a button to calculate the sum
        JButton calculateButton = new JButton("Calculate Sum");
        calculateButton.setBounds(160, 110, 150, 30);
        
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use null layout

        // Add components to the frame
        frame.add(FirstInput);
        frame.add(fInput);
        frame.add(sInput);
        frame.add(SecondInput);
        frame.add(calculateButton);
        
        // Define action listener for the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from the text fields
                    double num1 = Double.parseDouble(FirstInput.getText());
                    double num2 = Double.parseDouble(SecondInput.getText());
                    
                    // Calculate the sum
                    double sum = num1 + num2;
                    
                    // Display the sum in a dialog box
                    JOptionPane.showMessageDialog(frame, "The sum is: " + sum);
                } catch (NumberFormatException ex) {
                    // Handle invalid number format
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
