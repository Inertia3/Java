import java.awt.*;
import javax.swing.*;
public class swingframe {
    /**
     * 
     */
    swingframe(){
        JFrame f = new JFrame("New Frame");

        JLabel l1 = new JLabel("Label 1");
        JLabel l2 = new JLabel("Label 2");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        t1.setText("Sahil");
        t2.setText("Ansari");

        JButton b = new JButton("Click Me");

        b.setBounds(100, 100, 100, 100);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        swingframe sf = new swingframe();
    }

};
