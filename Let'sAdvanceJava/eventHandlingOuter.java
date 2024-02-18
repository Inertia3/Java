import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class eventHandlingOuter {
    Frame f;
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    eventHandlingOuter(){
        Label l1 = new Label("First");
        Label l2 = new Label("Second");

        

        Button b = new Button("Click me");
        b.setBounds(10,10,20,20);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        Outer o = new Outer(t1, t2);

        b.addActionListener(o);

        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        eventHandlingOuter e  =new eventHandlingOuter();
    }
}


class outer extends eventHandlingOuter implements ActionListener{

    outer(TextField t1, TextField t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();
        String s1 = t2.getText();
        t1.setText(s1);
        t2.setText(s);
    }

}
