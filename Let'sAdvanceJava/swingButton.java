
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class swingButton {
    /**
     * 
     */
    swingButton(){
        JFrame f = new JFrame("New Frame");

        JLabel l1 = new JLabel("Label 1");
        JLabel l2 = new JLabel("Label 2");

        JTextField t1 = new JTextField(40);
        JTextField t2 = new JTextField(40);


        JButton b = new JButton("Click Me");

        b.setBounds(100, 100, 100, 100);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("Sahil");
                t2.setText("Ansari");
                // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });

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
        swingButton sf = new swingButton();
    }

};

