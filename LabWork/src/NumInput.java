import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumInput {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Multiplication Calculator");
        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use null layout for absolute positioning

        JLabel fInput = new JLabel();
        fInput.setText("Input First Number :");
        fInput.setBounds(150, 30,200,25);
        
        JLabel sInput = new JLabel();
        sInput.setText("Input Second Number :");
        sInput.setBounds(150, 70,200,25);
        
        // Create text fields for inputs and result
        JTextField FirstInput = new JTextField();
        JTextField SecondInput = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Make result field non-editable

        // Set bounds for text fields (x, y, width, height)
        FirstInput.setBounds(350, 30, 300, 30);
        SecondInput.setBounds(350, 70, 300, 30);
        resultField.setBounds(350, 150, 300, 30);
        
        // Create a button to trigger multiplication
        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.setBounds(350, 110, 100, 30);
        
        // Add components to the frame
        frame.add(FirstInput);
        frame.add(SecondInput);
        frame.add(fInput);
        frame.add(sInput);
        frame.add(multiplyButton);
        frame.add(resultField);
        
        // Define action listener for the button
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from the text fields
                    double num1 = Double.parseDouble(FirstInput.getText());
                    double num2 = Double.parseDouble(SecondInput.getText());
                    
                    // Perform the multiplication
                    double product = num1 * num2;
                    
                    // Display the result in the resultField
                    resultField.setText(String.valueOf(product));
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
