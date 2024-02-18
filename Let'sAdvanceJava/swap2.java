// Event handling within the classs itself
import java.awt.*;
import java.awt.event.*;
public class swap2 implements ActionListener {
     Frame f;
     Label l1;
     Label l2;
     TextField t1;
     TextField t2;

     swap2(){
        f = new Frame("MyFrame");
        l1 = new Label("First");
        l2 = new Label("Second");

        t1 = new TextField(20);
        t2 = new TextField(20);

        Button b = new Button("Swap");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        b.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setVisible(true);
     }
      public void actionPerformed(ActionEvent ae){
        String s = t1.getText();
        String s1 = t2.getText();
        t1.setText(s1);
        t2.setText(s);
      }

    public static void main(String[] args) {
        swap2 sw2 = new swap2();
    }
}
