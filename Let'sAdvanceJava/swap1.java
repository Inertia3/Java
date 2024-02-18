//Event handling using the anonymous class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swap1 {
    
    swap1(){
        Frame f = new Frame("My Frame");

        Label l1 = new Label("First");
        Label l2 = new Label("Second");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);

        Button b = new Button("Swap");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        // handling the event
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String s = t1.getText();
                String s1 = t2.getText();
                t1.setText(s1);
                t2.setText(s);
            }
        });

        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        swap1 s1 = new swap1();
    }
}

