
// Event handling within the classs itself
import java.awt.*;
import java.awt.event.*;
public class swap3 {
     Frame f;
     Label l1;
     Label l2;
     TextField t1;
     TextField t2;

     swap3(){
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
        Outer o = new Outer(t1,t2);
        b.addActionListener(o);

        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setVisible(true);
     }
    public static void main(String[] args) {
        swap2 sw2 = new swap2();
    }
}

class Outer extends swap3 implements ActionListener{
    Outer(TextField t1, TextField t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    public void actionPerformed(ActionEvent ae){
        String s = t1.getText();
        String s1 = t2.getText();
        t1.setText(s1);
        t2.setText(s);
      }
}
