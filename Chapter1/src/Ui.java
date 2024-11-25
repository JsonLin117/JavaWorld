import javax.swing.*;
import java.awt.*;

public class Ui extends JPanel{

    @Override
    public void paint(Graphics g){
        int width = getWidth();
        int height = getHeight();
        g.drawString("Hello World", 100, 100);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setVisible(true);
        window.setContentPane( new Ui() );
        String vaccine = JOptionPane.showInputDialog("Enter a vaccine name(Options : AZ, BNT, Moderna, Janssen): ");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showMessageDialog(null, "Vaccine AZ\ndose: 2\nProtection: 95%");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "Vaccine BNT\ndose: 2\nProtection: 95%");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showMessageDialog(null,  "Vaccine Moderna\ndose: 2\nProtection: 95%");
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showMessageDialog(null,  "Vaccine Jan\ndose: 2\nProtection: 95%");
        }
    }
}
