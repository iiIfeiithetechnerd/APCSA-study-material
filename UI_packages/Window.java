import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("APCSA Study Material");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}