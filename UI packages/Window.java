import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("My Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Add a button
        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);

        // Display the window
        frame.setVisible(true);
    }
}